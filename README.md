# spring-boot-crud-thymeleaf
Sample Spring Boot web application with thymeleaf integration


Refer https://github.com/thymeleaf/thymeleaf-extras-springsecurity for more help on security.

The `#authorization` object can be used in a similar way, normally in `th:if`
or `th:unless` tags:

```html
<div th:if="${#authorization.expression('hasRole(''ROLE_ADMIN'')')}">
  This will only be displayed if authenticated user has role ROLE_ADMIN.
</div>
```