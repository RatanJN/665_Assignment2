
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ratan Jagath Naik          |
| Date         | 11/05/1997                 |
| Course       | Spring 2024                |
| Assignment # | 2                          |

# Assignment Overview
The primary objective of this assignment is to design and implement a delivery notification system using the Observer design pattern. This system aims to facilitate communication between a shop (the subject) and its drivers (the observers) in a way that when a new delivery request is generated by the shop, all registered drivers are automatically notified. The assignment focuses on demonstrating the practical application of design patterns to solve real-world problems, specifically how to manage dependencies between objects in a decoupled manner. 

By accomplishing this task, the assignment seeks to achieve several key learning outcomes: understanding and applying the Observer design pattern, enhancing the flexibility and maintainability of software through design patterns, and improving code quality by avoiding duplication and ensuring simplicity. The end goal is to create a system that is easy to extend (for instance, by adding new types of observers) and maintain, thereby preparing students to tackle complex software development challenges with scalable and robust design solutions.

# GitHub Repository Link:
https://github.com/RatanJN/665_Assignment2.git

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

ANS: The Observer design pattern used in the delivery notification system offers excellent flexibility. It allows for the easy addition and removal of observers (drivers) without changing the subject (shop) or affecting other observers. This means new types of drivers or delivery entities can be integrated seamlessly by implementing the Observer interface. Similarly, removing an entity is as simple as unregistering it from the subject. This design supports future growth and changes, making the system adaptable to new requirements without extensive modifications.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

ANS: The simplicity and understandability of the implementation are ensured through the use of the Observer design pattern, which clearly separates the roles of the subject and observers. This separation makes the system easy to grasp, as the flow of notifications from the subject to observers follows a straightforward pattern. Each class has a single responsibility, enhancing readability and maintainability. The design encourages modular code, allowing developers to easily add, modify, or remove components without impacting the overall system's integrity.

- Describe how you have avoided duplicated code and why it is important.

ANS: The design avoids duplicated code by encapsulating common behaviors within the Observer and Subject interfaces and their implementations. Observers share a common update mechanism, and the subject uniformly handles observer registration, deregistration, and notification. This reuse of code not only reduces the likelihood of errors but also simplifies maintenance. Avoiding duplicated code is crucial for maintaining a clean codebase, making it easier to update, understand, and debug, which in turn enhances development efficiency and product quality.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

ANS: The Observer design pattern was chosen for its suitability in scenarios where an entity needs to notify others about state changes without being tightly coupled to them. This pattern is ideal for the delivery notification system, as it allows the shop to broadcast delivery requests to multiple drivers (observers) who need to react to these notifications. The pattern promotes loose coupling, scalability, and flexibility, making it an excellent choice for systems where the number of observers or the nature of the notifications may change over time.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




