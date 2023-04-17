#Notes about static keyword in Java

##Overridable
A static method is overridable by subclass if the method is declared as static in both super and sub class

##Overloadable
You can have multiple static methods with the same name but different parameters.

##With interface
The following works if the static method has a body:
You can create a static method in interface and call the method using InterfaceName.methodname();
You can also implement the interface with another class and override it.

##With abstract class
You can declared a static concrete method and call it with Abstractclassname.methodname()
However, you cannot declared a abstract static method. "abstract" and "static" keyword cannot be used at the same time

##Called from non-static method
It is prohibited to call a static method from non-static method
Doing so will cause compilation error

##Inheritance
Static methods are inheritable
 

