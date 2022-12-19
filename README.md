# pokemon-back
TP1 : Pokémon - Licence Pro DIM 2022/2023

## Préambule

Le TP pokémon va vous permettre de mettre en pratique ce que vous avez appris pas par pas lors du TP1. 

En entreprise, vous serez un jour amené à travailler en équipe. Dans ce TP la partie front-end a déjà été développée. 

Pour pouvoir communiquer correctement avec elle, une configuration a été ajoutée dans votre projet back dans le package config. 
Cette configuration permet, entre-autre d'autoriser les différentes méthodes HTTP et les communications entre les 2 parties.


## Installation & démarrage du front
- l'URL du dépot git pokemon-front <a href="https://github.com/DwizN/pokemon-front">se trouve ici.</a>
- Pour les personnes ayant une configuration standard (port 8080 sur le back) vous pouvez récupérer uniquement le répertoire dist, et à l'intérieur taper la commande <i>serve -s</i>, le port par défaut utilisé sera le port 5000.
- Pour les personnes n'ayant pas une configuration standard, vous devrez installer une version de node, et taper les commandes présentes dans le readMe du projet front.

## Partie back & travail à effectuer
- Toutes les dépendances du projet ont été installées, vous êtes prêt à commencer (n'oubliez pas d'adapter votre fichier <i>application.properties</i> avec vos configs.)

Il vous est demandé dans ce projet de créer 5 web-services, pour pouvoir communiquer avec le front, vos web-services devront impérativement avoir la même URL que les URL ci-dessous : 

<img width="1129" alt="Capture d’écran 2022-11-12 à 16 02 30" src="https://user-images.githubusercontent.com/23740209/201517540-0ba64c5e-b693-4de4-868e-5b15768d1ae7.png">

Il vous est également demandé de respecter le nommage de vos DTO pour que l'affichage côté front se passe bien. Vous pouvez les retrouver ci-dessous ; 

<img width="1119" alt="Capture d’écran 2022-11-12 à 16 03 47" src="https://user-images.githubusercontent.com/23740209/201517541-139c4856-640b-4773-b1d5-f262dd36e7f2.png">

Ce sera les seules choses qui vont seront imposées. Pour le reste vous êtes libre d'implémenter ce que vous souhaitez (base de données, entités, formattage....)

## Notation 
Ce TP est noté. Il comptera pour 15% de votre note finale.
Vous avez 8h pour le réaliser. Vous serez évalué sur votre capacité à mettre à disposition les 5 web-services de façon à faire fonctionner la partie front qu'il vous a été donné. Une attention particulière sera portée sur le respect des différentes couches applicatives et la qualité de votre code.

Bon courage !

