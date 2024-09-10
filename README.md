# Spring Boot REST API with Basic Authentication

This project is a simple Spring Boot application that demonstrates how to implement basic HTTP authentication using Spring Security. It includes two endpoints: one public and one private. The public endpoint is accessible to everyone, while the private endpoint requires authentication.

## Features

- **Public Endpoint**: Accessible without authentication.
- **Private Endpoint**: Requires HTTP Basic authentication (username and password).
- **Spring Security**: Configured for authorization and authentication.
- **CSRF Disabled**: CSRF protection is disabled for this example (not recommended in production).

## Endpoints

- `GET /public`: Returns a welcome message accessible without authentication:
  ```json
  "👋 Hola! eres un usuario público"
  ```

- `GET /private`: Returns a restricted message, only accessible with valid credentials:
  ```json
  "Hey! eres un usuario privado 🕵️‍♂️"
  ```

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/repo-name.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd repo-name
    ```

3. **Run the application**:
    You can use your IDE or the following command to run the Spring Boot application:
    ```bash
    ./mvnw spring-boot:run
    ```

4. **Test the Endpoints**:
    - Access the public endpoint:
      ```
      GET http://localhost:8080/public
      ```
      This will return:
      ```json
      "👋 Hola! eres un usuario público"
      ```

    - Access the private endpoint (requires authentication):
      ```
      GET http://localhost:8080/private
      ```
      You will be prompted to enter a username and password. Once authenticated, it will return:
      ```json
      "Hey! eres un usuario privado 🕵️‍♂️"
      ```

## Authentication

- The credentials for accessing the private endpoint are set in the `application.properties` file:
    ```properties
    spring.security.user.name=user
    spring.security.user.password=password
    ```

## Requirements

- Java 17+
- Maven

## License

This project is open source and available under the [MIT License](LICENSE).
