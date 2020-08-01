# 2016-Spring

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

##  1a,

>What is Java

- Java is an OOP Language.
- It is platform independent.
- It is used to make Desktop application, back end web development, etc.
- It was developed by Sun Microsystems in 1991 later acquired by Oracle. 

>Hello Java in console

	class ClassName {
		public static void main(String[] args){
			System.out.println("Hello Java");
		}
	}


##  1b,

>Polymorphism

- Polymorphism is a feature of OOP Language which allows to have same function with different functionality.
- In java we can gain polymorphism through:-
	- **Method Overriding:** The process of over writing or re defining a function inherited from the parent class.
	- **Method Overloading:** The process of making methods with same name having different types or number of arguments passed.

[Example-Method Overriding]()
[Example-Method Overloading]()

##  2a,

>Interface

- Interface is a special type of class in java which doesn't have any instance variables and have methods with declaration part only.
- `interface` keyword is used to make a Interface.
- It provides abstraction.
- To implement a interface in a class we use `implement` keyword.

[Example]()

## 2b,

[Solution-file]()

##  3a,

>Usage of Exception Handling 

- The process of handling errors which occurs during runtime more wisely and easily is known as Exception handling.
- Exception has to be manually handled.
- Some of the ways of handling exception are:-
    - `try` and `catch` blocks
    - `throw` or `throws` keyword

- It is used to handle errors that occurs during runtime.

[Example]()

## 3b,

>"Hello World" in abc.txt file

	import java.io.*;
	
	class FileHandleDemo {
		FileHandleDemo(){
			try
			{
				FileWriter fw = new FileWriter("abc.txt");
				fw.write("Hello World");
				fw.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		public static void main(String[] args){
			new FileHandleDemo();
		}
	}

##  4a,

>Applet life cycle

- Applet is a special kind of Java program that can be run by the browser.
- It does not need any main method to run as it is runned by the browser not the JAVA compiler.
- The time from the start of the applet in the browser to closing of the browser is the life cycle of applet.
- There are 4 states:-
	- **New Born State:** The state where the applet is first loaded to the browser and life cycle of applet begins.
		- `init()` method is called in this state.
		- Most of the initialization is done in this state.
	- **Running State:** The state when applet is active in the foreground and is interacting with user.
		- `start()` method is invoked in this state.
		- After `start()` method `run()` followed by `paint()` methods are invoked.
		- User interacts with applet program in this state.
	- **Idle State:** The state when the page conatining applet is halted temporarily.
		- `stop()` method is called in this state.
		- After this state either `destroy()` or `start()` method is invoked according to the users choice.
	- **Dead State:** The state when applet program(i.e applet containing web page) is closed.
		- `destroy()` method is invoked in this state.
		- The `destroy()` method only gets invoked if the browser is shut down normally.


## 4b,

>What is Frame?

- A frame is a container of `AWT` that is used to make a window containing other graphical AWT components.
- It has methods like:-
	- `setSize(width, height)`
	- `setVisible(true/false)`
	- ` setLayout(LayoutType object)`
	- `setTitle("title")` 

[Frame solution]()

##  5a,

[Solution]()

## 5b,

>Event handling

- Event handling is the process of handling different kind of events like click, drag, etc inside a java program.
- The `java.awt.event` package provides many event classes and Listener interfaces for event handling.
- Different types of event available on java are:-

|**Event Classes**|**Listener Interfaces**|
|--|--|
|ActionEvent	|ActionListener|
|MouseEvent	|MouseListener and MouseMotionListener|
|MouseWheelEvent	|MouseWheelListener|
|KeyEvent	|KeyListener|
|ItemEvent|	ItemListener|
|TextEvent	|TextListener|
|AdjustmentEvent|	AdjustmentListener|
|WindowEvent|	WindowListener|
|ComponentEvent|	ComponentListener|
|ContainerEvent|	ContainerListener|
|FocusEvent	|FocusListener|

##  6a,

>Socket Programming

- Java socket programming is used for communnication between applications running on different JRE.
- It can be connection-oriented or connection-less.
- `Socket` and `ServerSocket` classes are used for connection-oreinted socket programming.
- `DatagramSocket` and `DatagramPacket` classes are used for connection-less socket programming.

[Example]()

## 6b,

>Use of JDBC

- It is used to connect the java application to the database.
- It is used to execute queries and update statements to the database.
- It is used to retrive the result recieved from the database.

>Role of JDBC Driver

- It is used to enable java application to interact with database.


## 7,

>a Inheritance

- Inheritance is a feature of OOP Language that allows to inherit data members and methods of one class *(i.e parent class)* to another class *(i.e child class)*
- In java `extends` keyword is used to inherit a parent class to a child class.
- In java `multiple inheritance` is not supported due to ambuigiuty.
- But we can use interfaces to obtain some level of multiple inheritance.

>c Java Virtual Machine

- JVM is a virtual machine that interprets the `Byte code` generated by JDK into a executable file for the running OS.
- It is a platform dependent software in itself but it makes the Java language a platform independent language.
- It gets the corresponding machine codes as the running OS when downloading the JDK.
