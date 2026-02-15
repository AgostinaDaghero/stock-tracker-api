# Stock Tracker API

Backend REST API built with Spring Boot for managing product stock and inventory operations.

## Features

- Role-based access control (ADMIN / USER)
- CRUD operations for products
- Layered architecture (Controller - Service - Repository)
- Spring Security configuration
- Basic authentication
- JPA/Hibernate persistence

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JPA / Hibernate
- MySQL (configurable)

## Architecture

The project follows a layered architecture:

- Controller layer: Handles HTTP requests and responses
- Service layer: Business logic
- Repository layer: Data persistence

## Security

- Role-based authorization using `@PreAuthorize`
- HTTP Basic authentication
