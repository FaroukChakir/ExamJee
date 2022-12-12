1)J'ai Créé les models et entities pour les class afain de définir les multiples tables de la Bdd "H2" 

2)J'ai créé Le repo pour la JPA

4) j'ai créer les microservices "billing - Customer - Product ..." 

5)j'ai créé le Getway pour la communication entre microservices créés

6)après j'ai définit le "FEIGN" qui est un client HTTP qui facilite grandement l'appel des API exposées par les différents microservices

7) Pour sécuriser l'application j'ai utilisé Keycloak qui s'occupe pour le processus de sécurité et d'authentification/rôles pour l'application en ajoutant des rôles au logins 

8)  La front Angular pas implémenté

==>Captures d'écran


*Pour la partie Login et creation de comptes : 

![image](https://user-images.githubusercontent.com/56736005/207004466-dd73bb62-d58e-413b-b526-8ea755dbbe49.png)
![image](https://user-images.githubusercontent.com/56736005/207004504-4dea7f63-ff2b-4ce9-bce8-bdc1f9fa74f2.png)

*Si le mot de passe ne contient pasd des charactères majiscules et miniscules comme indiqué dans les stratègies "Policies" :

![image](https://user-images.githubusercontent.com/56736005/207012872-183d1271-76a4-45de-a1df-b73bed53cf1d.png)

![image](https://user-images.githubusercontent.com/56736005/207012666-cfb08fbd-9c66-4284-8711-7949ce65c476.png)

Authenitificateur OTP:

![image](https://user-images.githubusercontent.com/56736005/207014393-a7e982ce-f579-4948-81b0-0ec173a6e828.png)


*Partie Produit :

![image](https://user-images.githubusercontent.com/56736005/207004784-c4b97948-1b2e-4490-9758-ae9e9f0071c7.png)

*Partie Supplier (fournisseur) :

![image](https://user-images.githubusercontent.com/56736005/207004869-cb26c22c-6dea-4f09-bee1-7fb76f1d8a1d.png)

*et si jamais l'utilisateur n'est pas autorisé à acceder : 

![image](https://user-images.githubusercontent.com/56736005/207005476-5fb40120-cf2c-4030-aa61-c8899ccdc50b.png)


