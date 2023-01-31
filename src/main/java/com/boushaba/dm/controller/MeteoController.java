package com.boushaba.dm.controller;

import com.boushaba.dm.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.DataInput;
import java.io.IOException;
import java.util.Collections;

@RestController
public class MeteoController {
    @Autowired
    RestTemplate info ;
    String token= "fba06c3fa609d00bb848b7238443bbedc906129336b703ebbbf7f794045419a6";
    @Autowired
    private ObjectMapper objectMapper;
    @PostMapping("/meteo")
    public String getAddresses(@RequestParam("address") String address, Model model) {
        String url = "https://api-adresse.data.gouv.fr/search/?q=" + address+"&limit=1";
        System.out.println(url);
        RootApi result = info.getForObject(url, RootApi.class);
        Feature feature = result.getFeatures().get(0);

        Double longitude = feature.getGeometry().getCoordinates().get(0);

        Double latitude = feature.getGeometry().getCoordinates().get(1);

        //Méteo API
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);


        String meteo_url = "https://api.meteo-concept.com/api/forecast/daily/0?token=" + token + "&latlng=" + latitude + "," + longitude;

        ResponseEntity<Example> response = info.exchange(meteo_url, HttpMethod.GET, requestEntity, Example.class);

        //Passage Model-View
        model.addAttribute("address", address);

        model.addAttribute("longitude", longitude);
        model.addAttribute("latitude", latitude);
        System.out.println(response.getBody().getForecast().getWind10m());
        //Passage Model-View
        model.addAttribute("body", response.getBody().getForecast());
        model.addAttribute("wind", response.getBody().getForecast().getWind10m());
        model.addAttribute("rain", response.getBody().getForecast().getRr10());
        model.addAttribute("tmin", response.getBody().getForecast().getTmin());
        model.addAttribute("tmax", response.getBody().getForecast().getTmax());
        model.addAttribute("sun_hours", response.getBody().getForecast().getSunHours());
        model.addAttribute("result", feature);
        return "meteo";
    }


}
