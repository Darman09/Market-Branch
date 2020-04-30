# MarketBranch - Réalisation d'une marketplace en 1 semaine

## Description
L’objectif du projet est de réaliser un site web via la technologie JEE de type place de marché aussi connu sous le nom de site d’E-Commerce. Ce site web va être réparti en trois grands axes tel que l’utilisateur, le vendeur et l’administrateur.
L’inscription ainsi que l’authentification doit être mise en place pour gérer les différents droits à l’application :</br>
<ul>
  <li>
  Les vendeurs doivent avoir accès à la gestion de ses produits et du stock tel que l’enregistrement des articles à mettre en vente et leur quantité.
  </li> 
  <li>
   Les clients authentifiés comme visiteur doivent pouvoir parcourir les catégories des différents articles, l’authentification des clients va leur permettre de gérer leurs profiles et de passer une/des commande(s). </li>
  <li>
  L’accès à l’administration permettra la visualisation et la gestion depuis l’application des différents utilisateurs et des données de l’application web.
  </li>
</ul>

## Déroulement
Le projet s'est déroulé en 4 jours de développement: </br>
<ul>
  <li><b>Jour 1 : </b>Définition d'un ensemble de cas d'utilisation de l'application, d'un modèle de base de données, des diagrammes de séquences pour chaque fonctionnalité.
  </li>
  </br>
  <li>
  <b>Jour 2 : </b>Développement de models en Java EE via le framework JPA ainsi que des premières vues tel que la connexion, l'inscription, la consultation du catalogue produit (1ère partie sans un système optimisé de filtres)
  </li>
  </br>
  <li>
   <b>Jour 3 : </b>Développpement d'une API de carte banquaire avec de simuler une transaction bancaire (Validation / Refus en fonction du solde du client), la gestion du panier, le passage d'une commande (1 ère partie sans intégration de l'API), la consultation de son historique de commandes et l'état de celle-ci, Consultation du catalogue produit de façon plus détaillée avec la notion de filtres selon les catégories / le prix, etc..
  </li>
  </br>
  <li>
    <b>Jour 4 : </b> Intégration de l'API banquaire dans l'application, développement de l'interface de gestion de produits côté vendeur, consultation des statistiques, gestion de stock pour les produits, gestion des comptes Vendeur & Client sur l'interface Administrateur, consultation de statistiques globale par catégories.
  </li>
</ul>

## Spécifications Techniques
<b>Langages:</b> Java J2EE</br>
<b>Framwork Back-End :</b>  JPA, EJB, Servlet</br>
<b>Framework Front-End :</b>  JSP, JSTL</br>
<b>Framework CSS :</b>  Materialize css</br>
<b>Base de données :</b>  MySQL

## Logiciels utilisés
<b>Base de données : </b>MySQL Workbench</br>
<b>IDE : </b>Netbeans 8.2</br>

## Configurations
<b>Serveur d'applications : </b>Glassgish 4.1.2</br>
<b>Base de données : </b>MySQL Mariadb 10.1.38</br>
