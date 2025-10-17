# ☕ Java 25 Features with Examples

This repository demonstrates the **key new features introduced in Java 25 (LTS)** through practical examples and explanations.

Each folder contains:
- A short **README.md** explaining the feature and its use case.
- A **demo Java file** showing how it works.
- Notes on whether it is **stable**, **preview**, or **incubator**.

## 🚀 Highlights
| # | Feature | Status | Description |
|---|----------|---------|--------------|
| 1 | Compact Source Files & Instance `main()` | Stable | Write minimal programs without explicit classes. |
| 2 | Module Import Declarations | Stable | Import modules directly in code. |
| 3 | Flexible Constructor Bodies | Stable | Allow logic before `super()` calls. |
| 4 | Scoped Values | Stable | Safer, immutable alternative to `ThreadLocal`. |
| 5 | Stable Values | Preview | Lazily initialized, effectively constant values. |
| 6 | Primitive Type Patterns | Preview | Pattern matching for primitives in `instanceof` / `switch`. |
| 7 | Vector API | Incubator | SIMD operations for high-performance math. |
| 8 | Key Derivation Function API | Stable | Built-in cryptographic key derivation. |
| 9 | Compact Object Headers | Stable | Reduced memory overhead per object. |
| 10 | Generational Shenandoah GC | Stable | Improved GC performance. |

## 🧰 Requirements
- **JDK 25**
- Use `--enable-preview` when running preview features:
  ```bash
  javac --enable-preview --release 25 MyFeatureDemo.java
  java --enable-preview MyFeatureDemo
  ```

## 📚 References
- [OpenJDK JDK 25 Project](https://openjdk.org/projects/jdk/25/)
- [InfoQ: Java 25 Released](https://www.infoq.com/news/2025/09/java25-released/)
