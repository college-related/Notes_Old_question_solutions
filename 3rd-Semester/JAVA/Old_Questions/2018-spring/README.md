# 2018-Spring

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

##  1a,

>Architectural-neutral

- Architectural-neutral defines as something that is independent of different platforms, like codes that can run in any OS(Operating System). Java is a Architectural-neutral Language because of the JVM which is in it self Architectural dependent but makes the java files Architectural-neutral.

>Wrapper class

- They are the classes that provides a way to use primitive data types(int, boolean, etc ..) as objects.
- some of the wrapper classes are:-

|**Primitive Data Type**|**Wrapper Class**|
|-------------------|------------|
|byte|Byte|
|float|Float|
|boolean|Boolean|


##  1b,

>Scope of modifiers

- **Public:** The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
- **Private**: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
- **Default**: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
- **Protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.


[Example]()

##  2a,

>Method overloading

- Method overloading is a way of gaining polymorphism in java where a method with same name can have different functionality.
- It can be done by adding extra arguments or having different types of argument. 

>Can we override private or static method?

- No, we cannot override a private or static method.
- This is because;- 
	- `Static method` are bonded during compile time and the reference to that method is only one made by the compiler, hence overridding only hides the new static method and calls the compiled one.
	-  `Private method` cannot be inherited, hence trying to override a private method only creates a new private method for the child class.
- **Though static and private methods can be overloaded** 

[Example]()

## 2b,

>Difference between interface and abstract class

[2011-fall/answer]()

##  3a,

>FileReader class

-  File Reader Class is a class used to read characters data or text data.
-   Here, we can read character by character by character; not line by line.

>BufferedWriter class

-   BufferedWriter is almost similar to FileWriter but it uses internal buffer to write data info file. So, if the number of write operation are more, the actual IO operations are less and performance is better.
-   You should use BufferedWriter when no. of write operations are more.

>Creating own execption subclasses

- **Step 1:** Make a class with Exception at the end and make it extend a Exception class.
	
		Example: public class ClassNameException extends Exception {}
- **Step 2:** Make a constructor of the class with a `String` argument and call super constructor inside it passing the argument.

		Example: 
		public class ClassNameException extends Exception {
			ClassNameException(String mssg){
				super(mssg); 
			}
		}
- Now we can use the *ClassNameException* Exception class where ever we need it.
[Example]()

## 3b,

>Difference Between applet and normal java program

|**Applet**|**Java Program**|
|-----|---|
|They are the java program that runs on a browser.|They are the java program that runs on a Java runtime environment.|
|They don't need a main method to start the program.|They need a main method to start the program.|

[Create Applet program]()

##  4a,

[Create swing GUI]()

## 4b,

>Different methods of drawing

- `drawLine(starting x, starting y, ending x, ending y);` **to draw a line.**
- `drawRect(starting x, starting y, ending x, ending y);` **to draw a Rectangle.**
- `fillRect(starting x, starting y, ending x, ending y);` **to draw a Rectangle filled with selected color.**
- `fillOval(starting x, starting y, width, height);` **to draw a Oval filled with selected color.**

[Display image Example]()

##  5a,

>Difference Between TCP and UDP

|**TCP**|**UDP**|
|---|---|
|*TCP* Stands for Transmission Control Protocal.|*UDP* Stands for User Datagram Protocal.|
|It is a connection oriented protocal.(*i.e the communication device should establish connection before and after transmitting data*)|It is a Datagram oriented protocal(*i.e there is no overhead for opening a connection.*)|
|It is more reliable as it makes sure the delivery of data is done.|It is less reliable as it doesn't make sure of the delivery.|
|It provides extensive error handling mechanism.|It provides only basic error checking mechanism.|
|It is slower than UDP.|It is faster than TCP.|
|It is used by HTTP, FTP, etc.|It is used by DNS, TFTP, etc.|


>InetAddress class

- It represents an IP address. It can convert domain name to IP address and also it can perform DNS lookup.
- Some methods of *InetAddress class* are: 
	- `public String getHostName();`
	- `public String getHostNameAddress();`
	- `String toString();`

## 5b,

>Key classes to work with datagrams

- `DatagramSocket class`:  This class is used for sending and receiving datagram packets.
- `DatagramPacket class`: This class helps in defining a message for sending and receiving during datagram communication.

>Getting list of IP Address 

[Example]()

##  6a,

>Benefits of using prepared Statement

-   Easy to insert parameters into the SQL statement.
-   Easy to reuse the  `PreparedStatement`  with new parameter values.
-   May increase performance of executed statements.
-   Enables easier batch updates.

>JDBC database connection pool 

## 6b,

[WAP to update]()

## 7,

>a, Inner Class

- A inner class or nested class is a class which is declared inside a class or interface.
- We use it to logically group classes and interfaces in one place so that it can be more readable and maintainable.
- **It can also access all the members of its outer class including private data members and methods.**

>c, Types of JDBC drivers

- **Type 1:** JDBC-ODBC driver.
	- In this type of driver, a JDBC bridge is used to access ODBC drivers installed on each client machine.
- **Type 2:** JDBC-Native API
	- In this type of driver, JDBC API calls are converted into native C/C++ API calls, which are unique to the database.
- **Type 3:** JDBC-Net pure Java
	- In this type of driver, a three-tier approach is used to access databases. The JDBC clients use standard network sockets to communicate with a middleware application server. The socket information is then translated by the middleware application server into the call format required by the DBMS, and forwarded to the database server.
- **Type 4:** 100% Pure Java
	- In this type of driver, a pure Java-based driver communicates directly with the vendor's database through socket connection.
