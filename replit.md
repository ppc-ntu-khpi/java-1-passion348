# Java OOP Class Creation Project

## Overview
This is a Java educational project for learning Object-Oriented Programming (OOP) concepts. The project demonstrates creating classes with attributes, constructors, and methods.

## Project Structure
- `src/main/java/domain/` - Domain classes (Customer class)
- `src/main/java/test/` - Test classes (CustomerTest with main method)
- `build.gradle` - Gradle build configuration with application plugin
- `Solution/` - Folder for storing screenshots of completed work

## Build System
- **Build Tool**: Gradle 8.x
- **Java Version**: GraalVM 22.3
- **Main Class**: `test.CustomerTest`

## Running the Project
The project uses Gradle to build and run:
```bash
./gradlew run
```

## Key Classes
- `domain.Customer` - Customer class with ID, isNew status, and total purchases
- `test.CustomerTest` - Main class demonstrating Customer class usage

## Workflow
- **Run Java**: Executes `./gradlew run --console=plain` to compile and run the application
