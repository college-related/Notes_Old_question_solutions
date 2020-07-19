# 2011 - FALL

## 1a,

>JVM is used for:- 

- JVM (Java Virtual Machine) is a interpreter that converts the Byte Code into machine-readble code.
- It is used to run the java files in the OS(Operating System).
- Whenever we install JDK, the corresponding JVM is installed making java a platform independent language.

>JRE :-

- JRE (Java Runtime Environment) is a software used to run Java system inside a OS.
- It consists of Java class libraries, JVM, Java class loader.
- It is a example of `abstraction`, abstracting the underlying OS into a consistent platform for running JAva applications.

## 1b,

>Uses of package:-

- Package in Java are constraints for classes.
- It allows to create a class named ABC(for example), which you can stire in one package and have a class named ABC in another package without worring about colliding.
- To make a package use the package command as the first statement in the java file.

Syntax:

    package package_name; {where package_name is the folder name usually}

- To use a class from a package use import command in the required file.

Syntax:

    import packge_name.ClassName;

>Difference between interface and abstract classes:-

|**Interface**|**Abstract**|
|-------------|------------|
|It provides full abstraction.|It doesnot provides full abstraction.|
|`interface` keyword is used to define it.|`abstract` keyword is used to define it..|


## 2a,

[Solution]()

## 2b,

>Reflection API

- Reflection API is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.
- Uses of Reflection API are:-
    - **Extensibility Features:** An application may make use of external, user-defined classes by creating instances of extensibility objects using their fully-qualified names.
    - **Debugging and testing tools:** Debuggers use the property of reflection to examine private members on classes.
- Disadvantage:-
    - **Performance Overhead:** Reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
    - **Exposure of Internals:** Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.

## 3a,

[Solution]()


## 3b,

>Security restrictions of applet:-

- An applet cannot load libraries or define native methods.
- An applet cannot ordinarily read or write files on the execution host.
- An applet cannot read certain system properties.
- An applet cannot make network connections except to the host that it come from.

>Attributes of applet tag are:-

- **CODEBASE:** It is an optional attribute that specifies the bse URL of the applet code.
- **CODE:** It is a required attribute that gives the file name that contains the compiled file(.class file).
- **ALT:** It is the attribute used by the browser when it recognizes the applet tag but cannot run JAVA applet at the moment.
- **VSPACE:** This attribute is used to determine the space on top and below the applet.
- **HSPACE:** This attribute is used to determine the space on each sides of the applet.

## 4a,


## 4b,

[Explanation with Example]()

## 5a,

[Solution]()

## 5b,

>Multicasting

- 

>Layout Manager classes (explain any two)

- FlowLayout
    - Arranges components like words on a page - From left to right in rows and then top to bottom as each row fills up.
    - Some of the constructors are FlowLayout(), FlowLayout(int align), etc.
- BorderLayout
- GridLayout
    - A container using the GridLayout scheme arranges components in rows and colums in row major order. Each component is sized to fit its respective grid cell.
    - Some of the constructors are GridLayout(), GridLayout(int rows, int cols), etc.
- CardLayout
- GridBagLayout

## 6a,

[Solution]()

## 6b,

[Solution]()

## 7,

>Static member variable

- 

>Swing

- 