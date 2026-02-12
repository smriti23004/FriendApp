# FriendApp
A springboot project created to save a friend entry and confirm it through an Internal API call

**The Concept**
This project simulates a microservices-style interaction within a single application.

1.Endpoint A receives data and saves it to the DB.
2.It then uses RestTemplate to make an internal HTTP call to Endpoint B.
3.Endpoint B verifies the persistence and returns a final confirmation string.

**Tech Stack**
Java 17+
Spring Boot
Spring Data JPA (Database ORM)
H2 Database (In-memory storage)
Lombok (Data mapping & Logging)
Maven (Dependency management)
