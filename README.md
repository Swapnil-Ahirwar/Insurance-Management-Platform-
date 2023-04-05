# # Insurance-Management-Platform-

## Spring Boot CRUD Project:
This is a simple Spring Boot Insurance-Policy-Management application that demonstrates how to perform CRUD (Create, Read, Update, Delete) operations on a MySQL database using Spring Data JPA. 
The application exposes a RESTful API that allows users to perform these operations on different entities.

## Tech
- [Spring Boot] - Powering our REST Apis with good, old Java.(Star of the show!! ✨✨)
- [Postman] - Postman to check Api is working coreectly or not.

## Installation
Start with setting up your own MySQL server and acquire url, username and password.
After doing that fork this repo and continue with IDE of your choice. 

### Backend (Spring Boot)
Locate the `application.properties` file and do the following changes:
```
spring.datasource.url = jdbc:<YOUR_CONNECTION_URL>?useSSL=false&serverTimezone=UTC
spring.datasource.username=<YOUR_USERNAME>
spring.datasource.password=<YOUR_PASSWORD>
```
Run the project in your IDE and "Voila! Your REST APIs are up and running". (I hope!😉 ). Now acquire the endpoint_url and proceed with the setup.

Check API through the postman:
1. Go to the Postman.
2. Write the endpoints with the your local localhost and choose whatever method you want to see.
3. Now run it!

## API Endpoints
The application exposes the following RESTful API endpoints:

#### For Clients:
```
GET -  /api/clients: Returns a list of all users.
GET -  /api/clients/{id}: Returns the user with the specified ID.
POST -  /api/clients: Creates a new user.
PUT -  /api/clients/{id}: Updates the user with the specified ID.
DELETE -  /api/clients/{id}: Deletes the user with the specified ID.
```

#### For Insurance Policy:
```
GET -  /api/policies: Returns a list of all users.
GET -  /api/policies/{id}: Returns the user with the specified ID.
POST -  /api/policies: Creates a new user.
PUT -  /api/policies/{id}: Updates the user with the specified ID.
DELETE -  /api/policies/{id}: Deletes the user with the specified ID.
```

#### For Claims:
```
GET -  /api/claims: Returns a list of all users.
GET -  /api/claims/{id}: Returns the user with the specified ID.
POST -  /api/claims: Creates a new user.
PUT -  /api/claims/{id}: Updates the user with the specified ID.
DELETE -  /api/claims/{id}: Deletes the user with the specified ID.
```
