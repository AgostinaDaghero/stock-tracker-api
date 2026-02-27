# Stock Tracker API

Stock Tracker API is a backend system built with Spring Boot, structured as two independent microservices:

- Auth Service → Handles authentication and JWT generation
- Inventory Service → Manages products and applies role-based authorization

The project demonstrates stateless authentication using JWT, method-level authorization with Spring Security, and a clean separation of responsibilities between services.

## 🚀 Features

- Stateless authentication using JWT
- Role-based authorization (ADMIN / USER)
- CRUD operations for products
- Microservices separation (Auth & Inventory)
- Method-level security using @PreAuthorize
- Custom JWT filters
- Password encryption using BCrypt
- OpenAPI (Swagger) documentation with JWT support
- JPA/Hibernate persistence

## 🏗 Architecture

The system is divided into two microservices:

🔐 Auth Service

- Authenticates users via email and password
- Uses AuthenticationManager
- Loads users from database
- Generates JWT tokens including roles
- Uses BCrypt for password hashing
- Stateless configuration (SessionCreationPolicy.STATELESS)

📦 Inventory Service

- Validates JWT tokens
- Extracts roles from token claims
- Applies role-based authorization using @PreAuthorize
- Implements CRUD operations for products
- Stateless configuration
- Swagger configured with Bearer authentication

## 🔐 Security

Authentication

- JWT-based authentication
- Tokens include:
  - Subject (email)
  - Roles
  - Issued date
  - Expiration date
- Stateless session management (SessionCreationPolicy.STATELESS)

Authorization

- Role-based access control:
  - USER → Can view products
  - ADMIN → Can create, update and delete products
- Method-level security enabled with @EnableMethodSecurity
- Custom JwtAuthenticationFilter in both services

## 🔄 Authentication Flow

1. Client sends POST /auth/login with email and password.
2. Auth Service authenticates user.
3. JWT is generated and returned.
4. Client includes token in request header:
   Authorization: Bearer <token>
5. Inventory Service validates token.
6. Roles are extracted from token.
7. Access is granted or denied based on role.

## 🛠 Tech Stack

- Java

- Spring Boot
- Spring Security
- JWT (jjwt)
- JPA / Hibernate
- MySQL (configurable)
- OpenAPI (Swagger)

## 🔮 Future Improvements

- Implement refresh tokens
- Add API Gateway
- Add automated testing (unit & integration)
- Implement global exception handling
- Add centralized logging
- Introduce CI/CD pipeline

## 🎯 Project Goal

This project was built to gain hands-on experience with:

- Spring Security internals
- Stateless authentication
- JWT-based authorization
- Microservices separation
- Role-based access control