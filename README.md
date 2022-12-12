1)J'ai Créé les models et entities pour les class afain de définir les multiples tables de la Bdd "H2" 

2)J'ai créé Le repo pour la JPA

4) j'ai créer les microservices "billing - Customer - Product ..." 

5)j'ai créé le Getway pour la communication entre microservices créés

6)après j'ai définit le "FEIGN" qui est un client HTTP qui facilite grandement l'appel des API exposées par les différents microservices

7) Pour sécuriser l'application j'ai utilisé Keycloak qui s'occupe pour le processus de sécurité et d'authentification/rôles pour l'application en ajoutant des rôles au logins 

8)  La front Angular pas implémenté

==>Captures d'écran


*Pour la partie Login et creation de comptes : 

![image](https://user-images.githubusercontent.com/56736005/207054066-9ea3367d-1098-4d96-9152-37a6849a87a0.png)
![image](https://user-images.githubusercontent.com/56736005/207054112-1cc5868e-089f-4c7b-a56a-e538ef95c8aa.png)

*Si le mot de passe ne contient pasd des charactères majiscules et miniscules comme indiqué dans les stratègies "Policies" :

![image](https://user-images.githubusercontent.com/56736005/207054167-6b634bc9-b3a5-48fc-a137-2ebe0e02bb66.png)

![image](https://user-images.githubusercontent.com/56736005/207054233-36eaa2c6-9a9c-4c4c-ad4f-6a050992cecf.png)

Authenitificateur OTP:

![image](https://user-images.githubusercontent.com/56736005/207054276-dca5f2c4-1c0e-4517-9b82-2f015bf08ade.png)


*Partie Produit :

![image](https://user-images.githubusercontent.com/56736005/207004784-c4b97948-1b2e-4490-9758-ae9e9f0071c7.png)

*Partie Supplier (fournisseur) :

![image](https://user-images.githubusercontent.com/56736005/207054321-1c2832ea-4d5b-45c8-bc20-67cbbedfcae9.png)

*et si jamais l'utilisateur n'est pas autorisé à acceder : 

![image](https://user-images.githubusercontent.com/56736005/207054412-ddc8fe03-b8db-4ddd-b4df-d8cdc164e503.png)

