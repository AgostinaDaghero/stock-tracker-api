# Stock Tracker API

Stock Tracker API is a backend system built with **Spring Boot** using a **microservices architecture**.

The system is composed of two services:

- **Auth Service** → Handles authentication and JWT generation
- **Inventory Service** → Manages products and enforces role-based authorization

The project demonstrates **stateless authentication with JWT**, **Spring Security authorization**, and a clean separation between authentication and business logic.

---

## 🚀 Features

- JWT-based authentication
- Role-based authorization (ADMIN / USER)
- Stateless security configuration
- Product CRUD operations
- Microservices architecture
- Method-level security with `@PreAuthorize`
- Password encryption with BCrypt
- OpenAPI (Swagger) documentation
- JPA / Hibernate persistence

---

## 🏗 Architecture

### Auth Service
Responsible for authentication.

- Authenticates users using email and password
- Generates JWT tokens containing user roles
- Uses Spring Security with BCrypt password hashing

### Inventory Service
Responsible for product management.

- Validates JWT tokens
- Extracts roles from token claims
- Applies role-based access control
- Implements product CRUD operations

---

## 🔐 Security

Authentication uses **JWT tokens** containing:

- User email
- Roles
- Issued date
- Expiration date

Authorization rules:

- **USER** → Can view products
- **ADMIN** → Can create, update and delete products

---

## 📡 Main Endpoints

### Auth Service

```

POST /auth/login

````

Returns a JWT token.

Example request:

```json
{
  "email": "admin@email.com",
  "password": "admin123"
}
````

### Inventory Service

```
GET /products
POST /products
PUT /products/{id}
DELETE /products/{id}
```

All requests require:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## ▶ Running the Project

1. Start **Auth Service**

Runs on:

```
http://localhost:8080
```

2. Start **Inventory Service**

Runs on:

```
http://localhost:8081
```

3. Login to generate a token

```
POST /auth/login
```

4. Use the token in requests:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 🛠 Tech Stack

* Java
* Spring Boot
* Spring Security
* JWT (jjwt)
* JPA / Hibernate
* MySQL
* OpenAPI (Swagger)

---

## 🎯 Project Goal

This project was built to practice:

* Spring Security internals
* Stateless authentication with JWT
* Role-based authorization
* Microservices architecture
