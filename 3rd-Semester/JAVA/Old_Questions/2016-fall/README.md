# 2016-Fall

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [3c](#3c) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

## 1a,

>How Java support re-usablilty

- Java is a platform independent langauge, And an OOP langauge. It supports features of OOP like inheritance, polymorphism, etc that makes re-usability of code possible and easier.
- Java have its own features like packages, etc that allows java program to have pack or group of classes, interfaces and other packages that can be used to again and again whenever necessary.

## 1b,

>Instance variable hiding/scope modifiers

[2018-Spring#1b]()

## 2a,

[Multilevel inheritace Program solution]()

## 2b,

>Usage of Exception handling

[2016-Spring#3a]()

>Difference between checked and unchecked exceptions

|**Checked Exception**|**Unchecked Exception**|
|--|--|
|Those exception which are checked during compile time.|Those exceptions which are checked during runtime.|
|If they are not handled then compiler gives error.|If they are not handled then compiler does not give any error.|

## 3a,

>Life cycle of Applet

[2016-spring#4a]()

## 3b,

[Message sharing betwwen HTML and Applet]()

## 3c,

>Difference between Panel and Frame

|**Panel**|**Frame**|
|--|--|
|An AWT component which represents a simple container that can attach other GUI components including other panel.|An AWT component which is a top level window with border and title.|
|It is a Subclass of container|It is a Subclass of Window|
|It doesnot have a title bar.|It has a title bar.|
|It does not have a border.|It has a border.|

## 4a,

[Changing background color of the fame]()

## 4b,

[Flag inside rectangle solution]()

## 5a,

>Socket

- A socket is simply a endpoint for communnications between the machines.
- The `Socket class` can be used to create a socket.

>Difference between datagram communication and stream communication

|**Datagram communication**|**Stream communication**|
|--|--|
|It is a connection less communication.|It is a conncetion oriented communication.|
|There is no connection just a source and a destination.|There is a pipe like connection allowing for duples connection.|
|It is unreliable.|It is reliable.|
|It doesnot maintain any sequence.|It maintains sequence.|

## 5b,

>Client server program

[2016-spring#6a]()

## 6a, 

>ResultSetMetadata

- The interface used to get the data about the data retrived from the resultset is called ResultSetMetadata.
- We can get data about the table like number of colum, column name, its type, etc.
- Some methods used to get meta data through resultsetmetadata are:-
    - `getColumnCount()` throws SQLException.
    - `getColumnName(int index)` throws SQLException.
    - `getColumnTypeName(int index)` throws SQLException.

[Example code]()

## 6b,

>Different types of database drivers

[2018-spring#7]()

## 7,

>Assigment vs initialization

[2015-Fall#1a]()

>Closable JFrame

- Closable Frame or JFrame are those type of Frame which can be closed.
- The default Frame which we make using `AWT` Frame and `Swing` JFrame cannot be closed by pressing the close menu in the Frame window instead we press `ctrl+c` in the command prompt to close them.
- We use the `WindowAdapter` class to implement some methods that can be used to make a closable frame.

>Runtime Polymorphism

- Runtime Polymorphism (or also known as dynamic dispatching) is the type of polymorphism that is gained at the runtime. 
- In Java any many other OOP languages it is obtained by method overriding.
- It makes the program more dynamic and more efficient.