# 2015-Spring

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

## 1a,

>Is JVM machine independent?

- No, JVM is not machine independent. It is actually machie dependent and makes Java a machine independent laguage.
- It is done so, by downloading the corresponding codes for the corresponding OS when we download the JDK.
- So, the class file or `bytecode` of a java file is interpreted by the JVM as per the need of OS.

## 1b,

>Why multiple inheritance is not suported in Java?

- Because of the ambiguity that is created when multiple inheritance is done.
- If two classes have functions with same name then the base class that inherits from both those classes will have two functions with same name. Hence creating a confusion when calling the method. It is called as `ambiguity`.

        Example:
            class A {
                public void show(){
                    System.out.println("Hello");
                }
            } 
            class B {
                public void show(){
                    System.out.println("Hi");
                }
            }
            class C extends A, B {
                public static void main(String[] args){
                    C obj = new C();

                    obj.show(); // Creates ambiguity
                }
            }

## 2a,

>Reflection and its usage.

[2011-Fall#2b]()

    Example:

## 2b,

>Custom Exception in java

[2018-Spring#3a]()

## 3a,

>Sandbox Security model

- Sandbox Security model is a security mechanism for separating running program, usually inorder to minimize system failure or software vulnerabilities from spreading.
- It is used by software developers to test new programming code.

- An applet can cause alot of harm as it is sent automatically as part of the page, So sandbox security model is used.

- A sandbox typically provides a tightly controlled set of resources for guest programs to run into, such as limited space on disk and memory.

## 3b,

>Displaying image in applet

[Code at 2018-Spring]()

## 3c,

>Difference between GridBag and Grid Layout

|**GridBag Layout**|**Grid Layout**|
|--|--|
|It is a flexible layout manager that aligns the components vertically and horizontally without requiring to have components of same size.|It puts all the components in a rectangular grid and is divided into equal size rectangles.|
|It places the components in individual cells and also allows to span to multiple column or rows.|It places the components in column and rows.|
|`GridBagConstraints` objects must be used to make a GridBag layout.|`GridLayout` class is used to make object of it.|
|It is more flexible.|It is less flexible.|

## 4a,

>Difference between AWT and Swing

[2017-Spring#6b]()

>Closable frame

[Solution at 2011-Fall]()

## 4b,

[Bar chart at 2014-spring]()

## 5a,

>URL

[2014-Spring#5a]()

>Program to write content in a given URL

[Solution at 2018-Fall]()

## 5b,

[Program solution at 2016-Fall]()

## 6a,

>Difference between Simple Statements amd Prepared Statements.

|**Simple Statements**|**Prepared Statements**|
|--|--|
|It makes the performance little slower.|It makes the performance faster.|
|`Statement` class is used to create a statement object.|`PreparedStatement` class is used to create a prepared Statement object.|
|It is less secure.|It is more secure.|
|The values are given into the query.|The values are given using setter methods of Prepared Statement.|

>Examples

[Simple Statement example]()

[Prepared Statement example]()

## 7

>JIT compile

- JIT(Just In Time) compiler is a feature of the runtime interpreter that instead of interpreting bytecode everytime a method os invoked, but will compile the bytecode into the machine code instructions of the running machine and then invokes this object code instead.
- Ideally the efficiency of running object code which overcome the inefficiency of recompiling the program every time it runs.

>Repaint method

- The `repaint()` method causes the AWT runtime system to execute the `update()` method of the component class which clears the window with the background color of the applet and then call the `paint()` method.

>Inner Class

[2018-Spring#7]()