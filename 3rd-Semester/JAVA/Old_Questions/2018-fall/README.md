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
	- Some Feature of `abstract class` are:-
		- They can have a normal methods too.
		- They cannot have their own object.

[Abstract keyword Example]()

## 2a,

[Solution to the given question of paramterizwd constructor]()

## 2b,

>Exception handling

[2016-spring#3a]()

[Program to handle arithmetic exception]()

## 3a,

>Dialog box and its type

- `Dialog box` is a component of AWT and SWING that is used to create a popup box with some content to display.
- `Dialog` class is used to make a dialog box.
- Syntax: `Dialog d = new Dialog(frame, "title", visible<true/false>);`
- There are 2 types of dialog box in java they are:-
	- **Modal Dialog:** Those types of dialog box which block input to other top-level windows. Choosing a file to open is a good example of it.
	- **Modeless Dialog:** Those types of dialog box which allow input to other window. Find text dialog is an example of it.

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

[Solution to given program of displaying info from a text file]() //TODO

## 4a,

[GUI with 3 textfield and 2 buttons with add and sub respectively. When clicked the buttons sum and difference of 1st 2 textfield should be displayed in 3rd textfield.]()

## 4b,

[Explanation and Difference between URL class and URL connection class {2014-Spring#5a}]()

[URL class example]()

[Url connection class example]()

## 5a,

[Display record of a table in a database. Assume name yourself.]()

## 5b,

>Difference between TCP and UDP

[2018-spring#5a]()

[TCP program of chat app {2016-fall/SocketProgram}]()

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

[Closable frame {2016-Fall}]()

[Bar Chart {2014-Spring}]()

## 7

>C, JDBC API

- 

>A, Reflection API

[2011-fall#2b]()

>B, History of Java

	1992 -- Started as internal project at sun microsystem
		 -- Headed by JAmes Gosling, Patrick Naughton and Mike Sheridan
		 -- Called 'Green Talk' with extension '.gt' and later called 'oak'
	1995 -- was renamed as Java, since oak was already registered by oak technologies.
		 -- Java(1.0a) both alpha and beta version relased for download.

	Jan,1996 -- JDK(JAVA DEVELOPMENT KIT)1.0 was released.
	Feb,1997 -- JDK 1.1
	Dec,1998 -- J2SE 1.2(Java 2 Standard Edition)
	May,2000 -- J2SE 1.3
	Feb,2002 -- J2SE 1.4
	Spe,2004 -- J2SE 5.0
	Dec,2006 -- Java SE 6
	July,2011 -- Java SE 7
	March,2014 -- Java SE 8
	Sep,2017 -- Java SE 9
	March,2018 -- Java SE 10
	Sep,2018 -- Java SE 11(LTS)
	March,2019 -- Java SE 12
	Sep,2019 -- Java SE 13
