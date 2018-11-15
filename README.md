# Avant toute chose

Il faut savoir que Kotlin possède sa propre documentation, disponible à l'adresse suivante :

https://kotlinlang.org/docs/reference/

N'hésitez pas à la consulter ou, si elle ne répond pas à vos questions, nous soliciter.

# Installation de l'environnement

Si vous êtes sur Eclipse :

Tout d'abord, vous êtes meilleurs que ceux sur IntelliJ, mais vous êtes moins bons que ceux qui codent sous VIM.

Pour pouvoir coder en Kotlin, vous devrez installer le plug-in Kotlin, disponible sur l'Eclipse Marketplace.
Pour cela :
- Help > Eclipse Marketplace...
- Dans la barre de recherche, entrer "Kotlin"
- Choisir "Kotlin Plugin for Eclipse 0.8.8 > Installer
- Redémarrer Eclipse
- Window > Perspective > Open perspective > Other...
- Choisir "Kotlin"

Si vous êtes sur IntelliJ :

Avant tout, personne n'est parfait, on ne vous jugera pas.

Ensuite, vous n'avez rien à modifier, Kotlin est un langage natif à IntelliJ

# Partie 1

Dans cette partie, nous allons aborder la notion de class pour pouvoir créer les différents types de Cellules qui constitueront le plateau de notre jeu de Démineur. De plus, nous allons pouvoir créer un plateau de jeu qui sera constitué de Cellules générées aléatoirement (Mine / Nombre).

Un résultat attendu serait le suivant :

![alt text](https://github.com/damiensauv/Tp_Kotlin_part1/blob/images/img/kotlin-part1-finalResult.PNG)

Le but va donc être tout d'abord de modifier la class Cellule.kt du package cells afin d'implémenter 2 classes qui hériteront de la classe abstraite Cellule. On voudra afficher, pour la classe Mine, un symbole qui représentera une mine (dans l'idéal, le symbole " * "), et pour la classe Nombre, le chiffre 0.

Par la suite, une fois ces classes créées (on pourra vérifier que le code est correct si la class Part1_Main.kt compile), on se rendra dans cette même classe Part1_Main.kt afin de créer un premier plateau de jeu qui sera entièrement visible.

Vous pourrez utiliser la méthode qui vous semble la plus optimisée pour afficher ce tableau (on ne jugera personne sur la qualité du code, on est pas là pour ça de toute manière).

Une fois ce tableau affiché, vous n'aurez qu'à cliquer droit sur votre code, "Run As" -> "Kotlin Application"

Vous devriez obtenir un résultat !