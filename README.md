# Ticket Management API

Production-ready Ticket Management REST API built using Spring Boot, Spring Data JPA, Hibernate, MySQL, DTO architecture, MapStruct, validation, and exception handling.

## Features

- Create, update, retrieve, and delete tickets
- Spring Data JPA and Hibernate ORM
- MySQL database integration
- DTO request and response models
- MapStruct object mapping
- Bean Validation
- Global exception handling
- Layered architecture (Controller-Service-Repository)

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- MapStruct

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | /tickets | Create Ticket |
| GET | /tickets | Get All Tickets |
| GET | /tickets/{id} | Get Ticket By ID |
| PUT | /tickets/{id} | Update Ticket |
| DELETE | /tickets/{id} | Delete Ticket |

## Architecture

Controller → Service → Repository → MySQL

## Future Enhancements

- Spring Security
- JWT Authentication
- Pagination and Sorting
- Docker Support
- Unit and Integration Testing
