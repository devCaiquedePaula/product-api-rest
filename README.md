# Complete RESTful API Project

This project is a complete RESTful API built with the latest versions of Spring Boot 3, Spring Framework 6, and Java 17. It adheres to the Richardson Maturity Model, ensuring a high level of RESTful maturity.

## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Richardson Maturity Model](#richardson-maturity-model)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Introduction

This API is designed to provide a robust, scalable, and high-performance RESTful web service. It leverages the latest features and enhancements from Spring Boot 3, Spring Framework 6, and Java 17 to deliver a modern API that adheres to best practices in software development.

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


## Richardson Maturity Model

The Richardson Maturity Model (RMM) is a way to evaluate the maturity of a RESTful web service. It consists of four levels:

1. **Level 0** - The Swamp of POX: Single URI endpoint, typically using HTTP POST for all actions.
2. **Level 1** - Resources: Multiple URI endpoints, each representing a resource.
3. **Level 2** - HTTP Verbs: Using standard HTTP methods (GET, POST, PUT, DELETE) for interactions.
4. **Level 3** - Hypermedia Controls: Utilizing Hypermedia As The Engine Of Application State (HATEOAS) to provide navigable links within responses.

This project aims to reach Level 3 by implementing HATEOAS to guide clients through the API, making it more self-explanatory and easier to use.

## Technologies Used

- **Spring Boot 3**: Simplifies the creation of stand-alone, production-grade Spring-based applications.
- **Spring Framework 6**: Provides comprehensive infrastructure support for developing Java applications.
- **Java 17**: The latest long-term support (LTS) release of the Java programming language, bringing new features and performance improvements.
- **HATEOAS**: Hypermedia as the Engine of Application State, a constraint of RESTful systems.

## Getting Started

### Prerequisites

- JDK 17 or later
- Maven 3.6.3 or later

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/complete-restful-api.git
    cd complete-restful-api
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

The application should now be running on `http://localhost:8080`.

## API Endpoints

Here are some example endpoints provided by this API:

### Resource: Users

- **GET /users**: Retrieve a list of all users.
- **GET /users/{id}**: Retrieve a specific user by ID.
- **POST /users**: Create a new user.
- **PUT /users/{id}**: Update a user by ID.
- **DELETE /users/{id}**: Delete a user by ID.

### Resource: Orders

- **GET /orders**: Retrieve a list of all orders.
- **GET /orders/{id}**: Retrieve a specific order by ID.
- **POST /orders**: Create a new order.
- **PUT /orders/{id}**: Update an order by ID.
- **DELETE /orders/{id}**: Delete an order by ID.

Each response includes hypermedia links to guide clients through available actions, adhering to HATEOAS principles.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.







