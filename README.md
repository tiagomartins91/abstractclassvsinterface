# Abstract Class vs Interface Demo Example

## Interface and Abstract Class are used for abstraction.

### Keyword:

* An interface is preceded with keyword interface.
* An Abstract class is preceded with keyword abstract.

### Access modifier:

* Data members in inteface are always public.
* Data members in abstract class can be private, protected, etc.

### Accessibility:

* Data members in inteface are always static.
* Data members in abstract class can be static and non-static.

### Type of Variable:

* Data members in inteface are always final.
* Data members in abstract class can be final and non-final.

### Methods:

* Methods in interface are by default abstract and public, java 8 can have body to the methods.
* Abstract class can have both abstract and non-abstract methods.

### Inheritance vs Abstraction:

* A class implements an interface.
* A class extends abstract class.

### Multiple implementations:

* A class can implement more than one interface.
* A class cannot extend more than one class.

#My Notes:

### Interfaces (100% abstraction)

* To be used needs to use impplements keyword.
* All variables are public static final
* Can only have abstract methods

### Abstract Class

* To be used needs to use extends keyword.
* Can have abstract methdos (without body) and non-abstract mehtods (with body)
* Abstract class can not be initialized.

### Usage:

If we know the implementations we can use Abstract Class, 
if we don't know the implementation it's better to use and interface.