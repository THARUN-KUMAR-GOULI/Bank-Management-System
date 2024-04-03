# Bank Management System

# Description:
* The Bank Management System is a comprehensive desktop application developed using Java technologies, including Spring Boot, Swing, and AWT, along with MySQL for database management.
* This application provides a user-friendly interface for managing various banking operations efficiently.

# Technologies Used:
* **Java**: Core programming language for developing the application logic.
* **Spring Boot**: Framework for building robust and scalable backend services.
* **Swing and AWT**: GUI libraries for creating the desktop application interface.
* **MySQL**: Relational database management system for storing and managing banking data.

# Key Features:
  **1) Account Management:**
 * Create new bank account for the User,and Perform transactions such as deposits, withdrawals, Balance check and so on.

  **2) Transaction History:**
 * Maintain a transaction log for each account, recording all deposit, withdrawal, and transfer transactions.

  **3) User Authentication and Authorization:**
  * Secure login system allowing Users with ID and PIN to access the system.
  * Secure data storage in the MySQL database with encryption.

# Implementation Details:

* **Spring Boot** will handle the **application configuration**, **database connection management**, and **dependency injection** for services.
* **Java code** will interact with the database using a **JDBC driver like MySQL Connector/J** to perform **CRUD** (Create, Read, Update, Delete) operations on bank account data.
* **Swing** will provide the visual components for **user interaction** with forms, tables, and buttons. AWT serves as the underlying foundation for Swing components.
* **Security** features can be implemented by allowing **access** only for registered customers and potentially **data encryption** in the database.
