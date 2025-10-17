# Scoped Values (JEP 506)
**Status:** Stable in Java 25

A safer and cleaner alternative to `ThreadLocal`, particularly suited for structured concurrency.

```java
ScopedValue.where(USER, "Alice").run(() -> {
    handleRequest();
});
```
Within the scope, the value is immutable and automatically cleared afterward.