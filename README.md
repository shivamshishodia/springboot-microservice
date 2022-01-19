# Getting Started

## Reference Documentation
This repository contains multiple microservices and spring cloud tools. General details are given below. Refer individual README markdowns for details.

## Must read guides

- https://spring.io/projects/spring-boot.
- https://resilience4j.readme.io/docs/circuitbreaker.

## Ports

| Application                       | Port                  |
| --------------------------------- | --------------------- |
| Limits Service                    | 8080, 8081, ...       |
| Spring Cloud Config Server        | 8888                  |
| Currency Exchange Service         | 8000, 8001, 8002, ..  |
| Currency Conversion Service       | 8100, 8101, 8102, ... |
| Netflix Eureka Naming Server      | 8761                  |
| Netflix Zuul API Gateway Server   | 8765                  |
| Zipkin Distributed Tracing Server | 9411                  |

## URLs

| Application                              | URL                                                                                                                              |
| ---------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| Limits Service                           | http://localhost:8080/limits http://localhost:8080/actuator/refresh  (POST)                                                      |
| Spring Cloud Config Server               | http://localhost:8888/limits-service/dev                                                                                         |
| Currency Converter Service - Direct Call | http://localhost:8100/currency-conversion-rest/from/EUR/to/INR/quantity/10000                                                    |
| Currency Converter Service - Feign       | http://localhost:8100/currency-conversion/from/EUR/to/INR/quantity/10000                                                         |
| Currency Exchange Service                | http://localhost:8000/currency-exchange/from/USD/to/INR                                                                          |
| Eureka                                   | http://localhost:8761/                                                                                                           |
| Spring API Gateway - DISABLED            | http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR                                                        |
| Spring API Gateway - REWRITE ROUTE       | http://localhost:8765/currency-exchange/from/USD/to/INR http://localhost:8765/currency-conversion/from/EUR/to/INR/quantity/10000 |
| Spring API Gateway - CUSTOM ROUTE        | http://localhost:8765/currency-conversion-od/from/EUR/to/INR/quantity/10000                                                      |
| Spring Circuit Breaker @Retry            | http://localhost:8000/sample-api                                                                                                 |
| Spring Circuit Breaker @CircuitBreaker   | http://localhost:8000/sample-api-circuit-breaker                                                                                 |
| Zipkin                                   | http://localhost:9411/zipkin/                                                                                                    |
| Spring Cloud Bus Refresh                 | http://localhost:8080/actuator/bus-refresh (POST)                                                                                |

## Docker

- Setup `Zipkin Distributed Tracing Server` using `docker run -p 9411:9411 openzipkin/zipkin:latest`.
