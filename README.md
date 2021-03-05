# spring-jwt-authentification
A small JWT authentification library to secure Spring Rest APIs with Spring Security

## Usage

First, add some properties to your `application.properties`:
```text
# this is required for authentification service itself to generate the JWT tokens
jwt.secret=mySecret
jwt.expiration=604800

# this is required for JWT filter, to validate the JWT tokens
jwt.header=Authorization
```
Second, implement a service which extends the `IAccountService` interface.