# Getting Started

## Reference Documentation
Please consider the following sections as these dependencies were exported explicitly. 

* [Config Server: Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)

## Setup

- Config Client dependency is already added.
- Check property files for git URI.
- This service will run at multiple ports i.e. 8000, 8001, 8002. to demonstrate load balancing across multiple instances.
- Currency conversion microservice will talk to load balancer which in turn will route requests to various ports of Currency Exchange Service.
- This microservice maintains it's own H2 in-memory database to store currency exchange rates [h2-console](http://localhost:8000/h2-console).

## URLs

- Currency Exchange Service: [/currency-exchange/from/USD/to/INR](http://localhost:8000/currency-exchange/from/USD/to/INR)
- Currency Conversion Service: /currency-conversion/from/USD/to/INR/quantity/10
