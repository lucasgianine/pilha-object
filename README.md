# 🔋 Pilha (Stack) Object
Working with stacks in data structure class

## Learn about the classes
#### 👉 Main, runs application using Stack in Java
#### 🔋 PilhaObj, generic implementation of the Stack class
This class is a generic implementation of a stack, able to hold any type of object. It includes methods to check if the stack is empty or full, add elements, remove and retrieve the top element, and display the stack's contents.

#### 📁 Repositorio, to organize the methods used
This class manages a collection of `JogadorFutebol` objects using both an `ArrayList` for storage and a custom stack implementation (`PilhaObj<Integer>`) to track the order of added players by their IDs. It includes methods to add, remove, display players, undo recent additions, and check the repository's size.

#### 🤾‍♂️ JogadorFutebol, class of a specific theme to test Stack
The `JogadorFutebol` class represents a football player with attributes such as ID, name, and other relevant details, designed to test the stack's functionality in a themed application.

## About repo
![GitHub last commit](https://img.shields.io/github/last-commit/lucasgianine/pilha-object)

## Features
- **PilhaObj<T>**: Implements basic stack operations like `push`, `pop`, `peek`, and checks for full/empty states. It can handle any type of object, showcasing the flexibility of generic classes in Java.
- **Repositorio**: Combines the use of an `ArrayList` and a `PilhaObj<Integer>` to manage a dynamic collection of players, supporting operations like add, delete, and undo which are crucial for maintaining the integrity of the application state.
- **Visual Display**: Both classes support methods that not only perform data manipulations but also provide visual feedback in the console, making it easier to follow the program's flow and debug if necessary.
