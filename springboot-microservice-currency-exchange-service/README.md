# Getting Started

## Setup

- **Config Client** dependency is already added.
- **Eureka Client** registers this service on naming server running on 8761 port. 
- Check property files for git URI.
- This service will run at multiple ports i.e. 8000, 8001, 8002. to demonstrate load balancing across multiple instances.
- Currency Conversion microservice will talk to load balancer which in turn will route requests to various ports of Currency Exchange Service.
- This microservice maintains it's own H2 in-memory database to store currency exchange rates [h2-console](http://localhost:8000/h2-console).

## URLs

- Currency Exchange Service: [/currency-exchange/from/USD/to/INR](http://localhost:8000/currency-exchange/from/USD/to/INR)
- Currency Conversion Service: [/currency-conversion/from/USD/to/INR/quantity/10](http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10)
