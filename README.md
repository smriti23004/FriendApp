# FriendApp
A springboot project created to save a friend entry and confirm it through an Internal API call

**The Concept**
<br>
This project simulates a microservices-style interaction within a single application.
 <br>
1.Endpoint A receives data and saves it to the DB.
<br>
2.It then uses RestTemplate to make an internal HTTP call to Endpoint B.
<br>
3.Endpoint B verifies the persistence and returns a final confirmation string.
<br>

**Tech Stack**
<br>
Java 17+
<br>
Spring Boot
<br>
Spring Data JPA (Database ORM)
<br>
H2 Database (In-memory storage)
<br>
Lombok (Data mapping & Logging)
<br>
Maven (Dependency management)
