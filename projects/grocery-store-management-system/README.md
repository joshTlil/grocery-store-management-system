# grocery-store-management-system
Table of Contents
1. System Overview
2. Architecture Design
3. Technologies Used
4. Future Development


System Overview 

This java console based application, is a simplicate Grocery Store Management program.

This program allows users to manage their inventory, create products, search products,

and simulate checkout lanes using multithreading. 

The program also uses serialization to persist data
To allow the user and save and load files. 

System Architecture

    User Interface Layer
            │
            ▼
      Main Controller
            │
            ▼
      Service Layer
            │
            ▼
        Data Layer


User Interface Layer
* Console Menu(Handles user input and navigation)

Controller 
* Executes a loop until user terminates the program
* Calls service methods based on user input

Service Layer 
* Implementation of business logic for inventory management 
* product search
* Checkout simulation

Data Layer
* Serialization for saving/loading inventory

Technologies Used
* Java 
* Java Collections 
* Serialization 
* Multithreading 
* Regex Validation 
* JUnit Testing 
* Git Version Control

Future Development
* React Frontend Dashboard
* Spring Boot REST API
* Database(MYSQL)
