package com.boushaba.dm.controller;

import com.boushaba.dm.model.Feature;
import com.boushaba.dm.model.GetInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.sound.sampled.Control;

@RestController
public class MeteoController {
    @Autowired
    RestTemplate info ;
    @Autowired
    private ObjectMapper objectMapper;
    @PostMapping("/meteo")
    public String getAddresses(@RequestParam("address") String address, Model model) {
        String url = "https://api-adresse.data.gouv.fr/search/?q=" + address;
        String result = info.getForObject(url, String.class);
        Feature feature = null;
        try {
            feature = objectMapper.readValue(result, Feature.class);
        } catch (JsonProcessingException e) {
            System.out.println("feature is null");
        }
        System.out.println(result);
        System.out.println(feature.getProperties().getName());
        model.addAttribute("result", result);
        return "meteo";
    }


}
