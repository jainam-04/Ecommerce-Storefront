# 🛍️ E-Commerce Storefront Application

This is a full-stack **E-Commerce Storefront** web application built using **Spring Boot** for the backend and **React (Vite)** for the frontend.  
It displays a **product catalog** using **dummy data** that is automatically seeded into the **MySQL database** each time the backend runs.  
The frontend is a **single-page application** built with **Bootstrap** for styling and uses the **Fetch API** to retrieve product data from the backend.  
This project focuses on showcasing product display and filtering.

---

## 📑 Table of Contents

- [🚀 Tech Stack](#-tech-stack)
- [⚙️ Features](#-features)
- [🗄️ Database Configuration](#️-database-configuration)
- [▶️ How to Run the Project](#️-how-to-run-the-project)
  - [1️⃣ Clone the Repository](#1️⃣-clone-the-repository)
  - [2️⃣ Backend Setup](#2️⃣-backend-setup)
  - [3️⃣ Frontend Setup](#3️⃣-frontend-setup)
- [🧠 Dependencies](#-dependencies)
  - [Spring Boot Dependencies](#spring-boot-dependencies)
  - [React Dependencies](#react-dependencies)
- [📸 Screenshots](#-screenshots)
- [👨‍💻 Author](#-author)

---

## 🚀 Tech Stack

| Layer | Technology | Description |
|-------|-------------|-------------|
| **Frontend** | React (Vite) | Fast, lightweight frontend framework for building the UI |
|  | Bootstrap | Responsive styling and layout framework |
|  | Fetch API | Used to fetch data from the backend (no Axios used) |
| **Backend** | Spring Boot | Java-based framework for building RESTful APIs |
|  | Spring Web | Provides web and RESTful capabilities |
|  | Spring Data JPA | Simplifies database interactions with ORM |
|  | Lombok | Reduces boilerplate code in Java classes |
| **Database** | MySQL | Relational database for storing application data |
| **Build Tools** | Maven, npm | Maven for backend builds, npm for frontend builds |

---

## ⚙️ Features

- 🧩 Dummy product data automatically seeded into MySQL database  
- 🛍️ Product listing displayed dynamically on frontend  
- 🔍 Category filter and product search  
- 💲 Sort products by price (Low to High / High to Low)  
- 💬 Data fetched from backend using Fetch API  
- 📱 Responsive single-page layout using Bootstrap  

---

## 🗄️ Database Configuration

Update your `application.properties` file in the backend with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<db-name>
spring.datasource.username=<Your username>
spring.datasource.password=<Your password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

## ▶️ How to Run the Project

### 1️⃣ Clone the Repository

``` bash
git clone https://github.com/jainam-04/Ecommerce-Storefront.git
cd Ecommerce-Storefront
```

### 2️⃣ Backend Setup
```bash
cd Ecommerce-StoreFront-Server
mvn clean install
mvn spring-boot:run
```
Server will start at: http://localhost:8080

### 3️⃣ Frontend Setup

```bash
cd Ecommerce-StoreFront-Frontend
npm install
npm run dev
```
React app will run at: http://localhost:5173

---

## 🧠 Dependencies

### Spring Boot Dependencies

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- mysql-connector-j
- lombok

### React Dependencies

- react-bootstrap
- bootstrap

---

## 📸 Screenshots

<img width="1918" height="872" alt="image" src="https://github.com/user-attachments/assets/1ed98637-9ee1-4369-8aaf-48382562a461" />

---

## 👨‍💻 Author

Jainam Rupani
📧 jainamrupani04@gmail.com
🌐 [GitHub](https://github.com/jainam-04)
