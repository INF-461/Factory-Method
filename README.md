# INF461 – Patron de conception Factory Method

**Auteur :** OYOKI  
**Cours :** INF461 – Patrons de conception  
**Patron étudié :** Factory Method (Fabrique)

## 1. Présentation

Factory Method est un patron de conception créationnel qui permet de créer des objets sans imposer à la classe cliente la connaissance de leur classe concrète.

La création des objets est confiée à une méthode de fabrique, ce qui facilite l'évolution du programme et réduit le couplage entre les classes.

## 2. Organisation du projet

Le projet contient deux implémentations :

- **Cours/** : contient l'exemple réalisé à partir du modèle étudié en cours.
- **Modifié/** : contient une version adaptée avec un nouvel exemple.

Chaque implémentation comprend les classes Java nécessaires à son fonctionnement.

## 3. Exemple du cours

L'exemple du cours met en œuvre le patron Factory Method à travers plusieurs classes :

- `Produit` : définit le type général de produit.
- `ProduitA`, `ProduitB` et `ProduitC` : représentent les produits concrets.
- `FabriqueProduit` : assure la création des produits.
- `Client` : utilise la fabrique pour obtenir les objets.

## 4. Exemple modifié

La deuxième implémentation reprend le principe du Factory Method dans un contexte différent afin de montrer comment ce patron peut être réutilisé pour répondre à un autre besoin.

## 5. Objectif pédagogique

Ce travail permet de comprendre :

- Le principe de création d'objets avec Factory Method.
- La séparation entre la création et l'utilisation des objets.
- Le rôle des produits concrets et de la fabrique.
- La réduction du couplage entre le client et les classes concrètes.

## 6. Exécution

Les deux versions sont indépendantes.

Pour tester une version :

1. Ouvrir le dossier correspondant.
2. Compiler les fichiers Java.
3. Exécuter la classe contenant la méthode `main`.

## 7. Conclusion

L'utilisation du patron Factory Method rend le code plus flexible et facilite l'ajout de nouveaux types de produits sans modifier directement le code client.

Ce projet a été réalisé dans le cadre du devoir sur les patrons de conception créationnels du cours INF461.
