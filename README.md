# TP 3 - BOUSHABA Otmane(partie 1)

## Spring Web
C'est un framework de développement web basé sur Spring qui facilite la création d'applications web en utilisant des technologies comme JavaServer Faces, Spring MVC, etc.

## Spring Data JPA
C'est un standard pour l'accès aux données en Java qui permet de gérer les données d'une application en utilisant des objets Java plutôt que des requêtes SQL.

## Hibernate
C'est une bibliothèque de mappage objet-relationnel (ORM) pour Java qui facilite l'accès aux données en utilisant JPA.

## H2 database
C'est un système de gestion de bases de données relationnelles écrit en Java qui peut être utilisé comme une base de données embarquée pour des applications web.

## DevTools
C'est un ensemble d'outils pour les développeurs de Spring qui permet de simplifier le développement et le débogage d'applications web.

## Thymeleaf
C'est un moteur de template pour les applications web qui permet de générer des vues en utilisant des fichiers HTML et des expressions Java.

## Questions :

### Etape 14
* Parametrage de l'URL d'appel : @GetMapping("/greeting")
* Choix du fichier HTML à afficher : return "greeting";
* name est donné par l'utilisateur à travers l'URL et après c'est passé à la vue grace au Model.addAttribute() qui remplace ${nomTemplate} par name

### Etape 17
Après la création de l'entité Address on remarque qu'une table Address s'ajoute parmi les tables de la base de données. Lorsque vous créez une nouvelle entité "Address" en utilisant Hibernate et JPA, cela signifie que vous allez mapper cette classe en utilisant les annotations JPA pour décrire les colonnes de la table correspondante dans la base de données. Lorsque vous démarrez l'application, Hibernate va utiliser ces annotations pour créer automatiquement la table "Address" dans la base de données H2. Plus spécifiquement, Hibernate va utiliser les informations de la classe "Address" pour générer un script SQL qui crée la table "Address" dans la base de données avec les colonnes appropriées et les contraintes de clé étrangère nécessaires. Ensuite, il va exécuter ce script pour créer réellement la table dans la base de données.

### Etape 20
Oui je peux voir tout contenu de data.sql

### Etape 22
L'annotation @Autowired de Spring permet d'automatiser l'injection de dépendance des répositories. Cela signifie que lorsque vous utilisez cette annotation sur une variable de répository, Spring va automatiquement instancier cette variable avec une instance de la classe de répository appropriée.

### Etape 30
J'ai obtenu les liens CDN vers des feuilles de styles distantes ainsi que d'autres scripts depuis la page officielle de Bootstrap et je les ai inclu dans les pages où je veux appliquer Bootstrap

# TP 3 - Aymane OUHADI (partie 2)

### Questions Etape 6
* La clé API est importante pour appeler MeteoConcept API et la raison principale pour laquelle les API nécessitent une clé API est pour des raisons de sécurité et la protection de l'API
* l'URL à appeler : https://api.meteo-concept.com/api/forecast/daily/0?token=CLE_API&latlng=LATITUDE,LONGITUDE

https://github.com/ayknes/dm
