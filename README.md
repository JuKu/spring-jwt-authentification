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
Second, implement a service which extends the `IAccountService` interface, for example:

```java
import com.jukusoft.authentification.jwt.account.IAccountService;

@Service
@Qualifier("iAccountService")
public class TestServiceImpl implements IAccountService {
    
    /* ... */
    
}
```

Third, create a spring security config class, e.q. `MyWebSecurityConfig`:

```java
import com.jukusoft.authentification.jwt.config.JWTWebSecurityConfig;

public class MyWebSecurityConfig extends JWTWebSecurityConfig {

    /**
     * pages which are accessible without login
     * 
     * @return array with page matchers
     */
    protected abstract String[] listPermittedPages() {
        return new String[]{"/testpage1", "/testpage2", "/res/**"};
    }
    
}
```

Also your UserEntity class has to implement the `IAccount` interface.

And also make sure, that Spring can find the `com.jukusoft.authentification.jwt.AuthentificationController` class, maybe you have to add this to your controller search path.