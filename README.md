# Employee-Management-REST-API-using-SpringBoot-SpringDataJPA 
This project involved developing a comprehensive system for managing employee records. Using Spring Boot, a Java-based framework for web application development, I built a RESTful API that enables users to perform CRUD operations (create, read, update, delete) on employee data.

## Features
- **Create**: Add new employee records to the system.
- **Read**: Retrieve employee information by ID or other criteria.
- **Update**: Modify existing employee records.
- **Delete**: Remove employee records from the system.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
   MySQL Database (used for both development and production)
- Maven (for dependency management)
- Postman (for API testing)
  
## Project Structure
The project directory follows a standard Maven project structure: 
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── qsp
│ │ │ ├── controller // Contains REST controller classes
│ │ │ ├── dto       // Contains Data Transfer Object (DTO) classes
│ │ │ ├── entity // Contains JPA Entity classes
│ │ │ ├── repository // Contains Spring Data JPA repository interfaces
│ │ │ ├── service // Contains service layer classes
│ │ │ └── EmployeeManagementApplication.java // Main Spring Boot Application class
│ │ └── resources
│ │ └── application.properties // Application configuration properties
└── pom.xml // Maven project configuration file

## Testing with Postman
To ensure the functionality and reliability of the system, I conducted thorough testing using Postman. This involved testing various API endpoints for different HTTP methods such as GET, POST, PUT, and DELETE. Below are some sample API endpoints you can test:

- **GET /employees**: Retrieve all employees.
- **GET /employees/{id}**: Retrieve an employee by ID.
- **POST /employees**: Create a new employee.
- **PUT /employees/{id}**: Update an existing employee.
- **DELETE /employees/{id}**: Delete an employee by ID.

## Setup and Usage
1. **Clone the Repository:**
2. **Build the Project:**
3. **Run the Application:**
4. **Access the API:**
Once the application is running, you can access the API endpoints using tools like Postman. You can send HTTP requests to the endpoints mentioned above to perform CRUD operations on employee records.
