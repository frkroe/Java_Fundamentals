# Java Hola Mundo

## Description
This repository contains the code for the Java Hola Mundo project. It's the place to try out the basic Java features and libraries.


## Project structure
The project is structured in the following way:

```
.
├── README.md
├── holamundo.iml (IntelliJ IDEA project file that contains the project settings)
├── .idea (hidden folder that contains the IntelliJ IDEA project settings)
├── out (folder that contains the compiled code)
├── src (folder that contains the source code)
│   ├── com.pack (a package which is the root package for the project
│   │   ├── Main.java (the main class that will be executed and imports the Product class)
│   │   ├── models (a package)
│   │   │   └── Product.java (a class)

```

## Terminology

| Term       | Description                                                                                 | Example                                    |
|------------|---------------------------------------------------------------------------------------------|--------------------------------------------|
| Project    | A project is a group of files that are conceptually complete and share a common goal.       | holamundo                                  |
| Package    | A package is a namespace that organizes a set of related classes and interfaces.            | com.pack                                   |
| Class      | A class is a blueprint or prototype from which objects are created.                         | Product                                    |
| Method     | A method is a collection of statements that perform some specific task and return a result. | getProductName()                           |
| Statement  | A statement is a command that the programmer gives to tell the computer to do something.    | System.out.println("Hello World!");        |
| Expression | An expression is a construct made up of variables, operators, and method invocations.       | 1 + 2                                      |
| Variable   | A variable is a container which holds the value while the Java program is executed.         | int a = 1;                                 |
| Instance   | An instance is a single and unique unit of a class.                                         | Product product = new Product(parameters); |

## How to run the project
1. Clone the repository (Git -> Clone -> Enter the repository URL)
2. Open the project in IntelliJ IDEA (File -> Open -> Select the project folder)
3. Run the Main class (right click on the Main class and select Run Main.main() or press Shift + F10)
4. Check the output in the console
