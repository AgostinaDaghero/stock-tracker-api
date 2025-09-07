# Stock Tracker API

Backend API built with **Java** for managing product stock and inventory operations.  
The system provides user authentication with roles (Admin and Employee) and includes tools for product management, stock movements, and reporting.  

---

## 🚀 Features

### 🔐 User Roles
- **Admin**
  - Create, update, and delete products.
  - Manage users and assign roles.
  - Record stock entries and exits.
  - Generate inventory reports.
- **Employee**
  - Check stock availability.
  - Record sales (stock outflow).
  - Register product entries (if allowed by admin).

### 📦 Product Management
- Add, update, and remove products.
- Categorize products and add descriptions.
- Track available quantities.

### 📊 Stock Operations
- Record product inflows and outflows.
- Keep history of stock movements.
- Alerts for low stock.

### 📈 Reports
- Current stock by product.
- Movements by date range.
- Low-stock alerts.

---

## 🛠️ Tech Stack
- **Java** (Backend)
- **Spring Boot** (Framework)
- **Hibernate / JPA** (ORM)
- **MySQL / PostgreSQL** (Database)
- **JWT** (Authentication)

---

## 📂 Project Structure (planned)