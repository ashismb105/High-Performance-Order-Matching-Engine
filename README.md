# Spring Boot Order Matching Engine

## Overview

The Spring Boot Order Matching Engine is a backend application that simulates a financial trading system by matching buy and sell orders based on price and quantity. The application provides REST APIs for order management and demonstrates core concepts of trading systems, Spring Boot development, and database integration.

## Features

* Create Buy and Sell Orders
* View Order History
* Order Matching Logic
* Trade Execution Simulation
* RESTful APIs
* PostgreSQL Integration
* Spring Data JPA
* Maven Build Support
* Exception Handling
* Scalable Layered Architecture

## Tech Stack

* Java 21
* Spring Boot 3.x
* Spring Data JPA
* PostgreSQL
* Maven
* REST API
* Lombok
* JUnit 5

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.tradingengine
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── entity
│   │       └── TradingApplication.java
│   │
│   └── resources
│       └── application.properties
│
└── test
```

## API Endpoints

### Create Order

POST /api/orders

Request Body

```json
{
  "symbol": "BTCUSD",
  "side": "BUY",
  "quantity": 10,
  "price": 50000
}
```

### Get All Orders

GET /api/orders

## Database Configuration

Update application.properties:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tradingdb
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Installation

### Clone Repository

```bash
git clone https://github.com/your-username/springboot-order-matching-engine.git
```

### Navigate to Project

```bash
cd springboot-order-matching-engine
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts at:

```text
http://localhost:8080
```

## Future Enhancements

* Real-Time Order Book
* WebSocket Market Data Streaming
* gRPC Communication
* LMAX Disruptor Integration
* Docker Deployment
* Kubernetes Support
* Authentication and Authorization
* Performance Monitoring

## Learning Outcomes

* Spring Boot Development
* REST API Design
* Database Integration
* Layered Architecture
* Maven Build Management
* Backend Application Development

## Author

Ashis Kumar Nayak

## License

This project is licensed under the MIT License.

