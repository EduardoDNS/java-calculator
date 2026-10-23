# Java Calculator

A Java console calculator built to practice classes, methods, user input, and control flow.

## Features

- Addition.
- Subtraction.
- Multiplication.
- Division.
- Repeated calculations during the same run.

Input validation and division-by-zero handling are areas for further improvement; see the roadmap below.

## Technologies and concepts

- Java.
- Classes and objects.
- Methods and constructors.
- `Scanner` for console input.
- Conditional statements and loops.
- Basic input and error handling.

## Project structure

```text
src/
├── application/
│   └── Program.java
├── entities/
│   └── Calculator.java
└── module-info.java
```

## How to run

Open the project in a Java-compatible IDE and run `application.Program`.

Terminal commands depend on the installed JDK version and the project's module configuration. Add exact compile/run commands after validating them in the intended environment.

## Example interaction

```text
Enter first number: 12
Enter second number: 3
Choose an operator (+, -, *, /):
+
15.0
Continue? (y/n)
```

The exact prompts and numeric formatting may differ from the current implementation.

## Roadmap

- [ ] Make calculator fields `private` and expose only the required behavior.
- [ ] Handle empty lines and unexpected input without crashing.
- [ ] Ensure division by zero is handled by the calculator logic, not only by the user interface.
- [ ] Use clear, descriptive method names.
- [ ] Add unit tests for all four operations and invalid cases.
- [ ] Document the Java version and verified build/run steps.

## Project status

This is a learning project that can be improved through validation, encapsulation, and automated testing.
