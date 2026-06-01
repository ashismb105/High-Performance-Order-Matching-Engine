# High-Performance-Order-Matching-Engine

A low-latency financial trading engine built using Java 21 and Spring Boot that matches buy and sell orders in real time. The system is designed to process high-volume transactions efficiently while maintaining strict price-time priority execution.

## Features

* Real-time Order Matching
* Price-Time Priority Execution
* Buy and Sell Order Management
* Trade Generation and Settlement
* REST API for Order Submission
* Event-Driven Architecture
* High-Concurrency Processing
* PostgreSQL Persistence
* Unit Testing with JUnit 5
* Performance Benchmarking Support

## Technology Stack

* Java 21
* Spring Boot 3.x
* Spring Data JPA
* PostgreSQL
* Maven
* JUnit 5
* Lombok
* Docker
* Swagger/OpenAPI

## Architecture

Client → REST API → Order Service → Matching Engine → Trade Service → Database

## Project Structure

```text
src/
├── main/
│   ├── java/com/tradingengine
│   │   ├── controller
│   │   ├── service
│   │   ├── entity
│   │   ├── repository
│   │   ├── dto
│   │   └── config
│   └── resources
│
└── test/
```

## API Endpoints

### Place Order

POST /api/orders

Request Body:

```json
{
  "symbol": "BTCUSD",
  "side": "BUY",
  "quantity": 10,
  "price": 50000
}
```

### Get Order Book

GET /api/orders/book/{symbol}

### Get Trade History

GET /api/trades

## Database Configuration

Update application.properties:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tradingdb
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Application

Clone the repository:

```bash
git clone https://github.com/your-username/high-performance-order-matching-engine.git
```

Navigate to the project:

```bash
cd high-performance-order-matching-engine
```

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

## Future Enhancements

* LMAX Disruptor Integration
* Chronicle Map Off-Heap Storage
* gRPC Communication
* WebSocket Market Data Streaming
* Event Sourcing
* Distributed Matching Engine
* Kubernetes Deployment
* JVM Low-Latency Tuning
* JMH Performance Benchmarks

## Performance Goals

* Sub-millisecond Order Processing
* Millions of Transactions Per Second
* High Availability and Fault Tolerance
* Low Memory Footprint
* Optimized Concurrent Processing

## Author

Ashis Kumar Nayak

## License

This project is licensed under the MIT License.
