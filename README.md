# Workshop Spring Boot MongoDB

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/IannNS/workshop-springboot-mongoDB/blob/main/LICENSE) 

## About the project

This project is a RESTful API built with **Java** and **Spring Boot**, using **MongoDB** as the database.

The application was developed to explore **NoSQL** database concepts, comparing them with the relational paradigm. The domain model represents a simple social network system with **Users**, **Posts**, and **Comments**, covering key MongoDB design patterns:
- Embedded documents (e.g., Comments inside Posts).
- Document references (e.g., Author referenced in Posts).

### Key Features
- **CRUD Operations**: Create, Read, Update, and Delete for Users.
- **Object-Document Mapping (ODM)**: Using Spring Data MongoDB.
- **Exception Handling**: Standardized error responses.
- **Queries**: Custom search methods (e.g., finding posts by text or date range).

## Domain Model

The domain consists of:
1. **User**: Has an ID, name, email, and a list of posts.
2. **Post**: Has a date, title, body, author (User), and a list of comments.
3. **Comment**: Has text, date, and an author (User).

## Technologies used

- Java
- Spring Boot
- Maven
- MongoDB (NoSQL Database)
- Postman (for testing endpoints)

## How to run the project

### Prerequisites
- Java 17 or higher
- Maven
- MongoDB installed and running locally on port `27017` (or configured in `application.properties`)

```bash
# Clone the repository
git clone [https://github.com/IannNS/workshop-springboot-mongoDB](https://github.com/IannNS/workshop-springboot-mongoDB)

# Enter the directory
cd workshop-springboot-mongoDB

# Run the application
mvn spring-boot:run
