# 2018-Fall

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

## 1a,

>Difference between interface and abstract class

[2011-fall#1b]()

>Use of interface for multiple inheritance

- Java does not support multiple inheritance due to ambugiuty problem.
- But using interface we can gain certain amount of multiple inheritance.
- The 2 ways to gain multiple inheritance by using interface are:-
    - Implementing multiple interface in a class.

        Example syntax:
            class ClassName implements Interface1, Interface2 { }

    - Inheriting multiple interface in a interface.

        Example syntax:
            interface InterfaceName extends Interface1, Interface2 { }

## 1b,

>Uses of abstract keyword

- `Abstract keyword` is used to make methods or class abstract.
- Methods and classes are made abstract to make a blue print for inheriting class.
- It is used to obtain abstraction.
- 

[Example]()

## 2a,

[Solution]()

## 2b,

>Exception handling

[2016-spring#3a]()

[Program to handle arithmetic exception]()

## 3a,

>Dialog box and its type

- `Dialog box` is a component of AWT and SWING that is used to create a popup box with some content to display.
- `Dialog` class is used to make a dialog box.
- Syntax: `Dialog d = new Dialog(frame, "title", visible<true/false>);`

[Creating dailog box]()

## 3b,

>Stream classes in java

- Stream class are those classes that allows stream behaviour in java file handling.
- Stream is linked to a physical layer by java io system to make input and output operations.
- We use `java.io` package to use stream classes.
- There are two types of Stream class in java:-
	-  **Byte Stream**
	
			Some of the Byte Stream classes are:-
			BufferedInputStream
			BufferedOuputStream
			DataInputStream
			DataOutputStream
			FileInputStream
			FileOutputStream
			InputStream
			OutputStream
			PrintStream
		
	-  **Character Stream**

			Some of the character Stream classes are:-
			BufferedReader
			BufferedWriter
			FileReader
			FileWriter
			InputStreamReader
			OutputStreamReader
			Reader
			Writer
			PrintWriter

## 4a,

[GUI-Solution]()

## 4b,

[]()

[URL class example]()
[Url connection class example]()

## 5a,

[Display record]()

## 5b,

>Difference between TCP and UDP

[2018-spring#5a]()

[Program solution]()

## 6a,

>Difference between applet and java program

[2018-spring#3b]()

>Applet to java application

    Step 1: Import `java.awt.*` and remove `java.applet.*`
    Step 2: Extend `Frame` rather than `Applet`
    Step 3: Change the `init()` method to a `Constructor`
    Step 4: Add `setSize()` and `setVisible()` for frame
    Step 5: Add a `main` method.
    Step 6: Remove HTML file. And Remove the comment if any

## 6b,

[Closable frame]()
[Bar Chart]()

## 7

>C, JDBC API

- 

>A, Reflection API

>B, History of Java