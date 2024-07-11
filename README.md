# RESTful API Project

This project is a comprehensive RESTful API built using the latest versions of Spring Boot 3, Spring Framework 6, and Java 17. It follows the Richardson Maturity Model to ensure a robust and scalable architecture.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Richardson Maturity Model](#richardson-maturity-model)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This API is designed to demonstrate the capabilities and best practices of building RESTful services with Spring Boot 3, Spring Framework 6, and Java 17. It aims to provide a clean, efficient, and scalable solution for handling RESTful requests and responses.

## Technologies Used

- **Java 17**
- **Spring Boot 3**
- **Spring Framework 6**
- **Maven**
- **H2 Database (for development and testing)**
- **Postman (for testing endpoints)**

## Richardson Maturity Model

The Richardson Maturity Model is a way to evaluate the maturity of a RESTful API. It is divided into four levels:

1. **Level 0** - The Swamp of POX: Uses HTTP as a transport protocol for remote interactions, typically with a single URI and methods.
2. **Level 1** - Resources: Introduces the concept of resources with unique URIs.
3. **Level 2** - HTTP Verbs: Utilizes standard HTTP methods (GET, POST, PUT, DELETE) to interact with resources.
4. **Level 3** - Hypermedia Controls (HATEOAS): Adds hypermedia controls to guide clients on how to use the API effectively.

This project adheres to Level 3 of the Richardson Maturity Model, providing a fully mature RESTful API with hypermedia controls.

## Project Structure

src/<br>
└── main/<br>
├── java/<br>
│ └── com/<br>
│ └── example/<br>
│ └── restapi/<br>
│ ├── controller/<br>
│ ├── model/<br>
│ ├── repository/<br>
│ ├── service/<br>
│ └── RestApiApplication.java<br>
└── resources/<br>
├── application.properties<br>
└── data.sql<br>



