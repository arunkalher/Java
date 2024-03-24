# Method Overloading in Java

### If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

### If we have to perform only one operation, having same name of the methods increases the readability of the program.

### Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

### So, we perform method overloading to figure out the program quickly.


```java
class Calculator{
    public int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class Demo
{
    public static void main(String a[])
    {
        int num1=1;
        int num2=2;
        int result=num1+num2;
        Calculator calc=new Calculator();
        System.out.println(calc.add(num1,num2,10)); //13
        System.out.println(calc.add(num1,num2)); //3
    }
}


```


## Advantage of method overloading
### Method overloading increases the readability of the program.

## Different ways to overload the method
### There are two ways to overload the method in java

### By changing number of arguments
### By changing the data type

## 1. Method Overloading: changing no. of arguments

```java
class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  
```

# 2. Method Overloading: changing data type of arguments

```java

class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}}  
```


### In java, method overloading is not possible by
### changing the return type of the method only because of
###  ambiguity. Let's see how ambiguity may occur:

```java
class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}}  

// Compile Time Error: method add(int,int) 
// is already defined in class Adder
// how can java determine which sum()
 method should be called??
```

## Overload mian() function?

### Yes, by method overloading. You can have any number
### of main methods in a class by method overloading. But
### JVM calls main() method which receives string array 
### as arguments only. Let's see the simple example:

```java
class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  

//main with String[]
```

## Method Overloading and Type Promotion

### One type is promoted to another implicitly if no matching datatype is found. Let's understand the concept by the figure given below:




###                     byte
###                      ||
###                     short
###                      ||
###             char => int => float
###                      || \ /  ||
###                      || / \   ||     
###                     long=> double

### Example of Method Overloading with TypePromotion

```java
class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  OverloadingCalculation1 obj=new OverloadingCalculation1();  
  obj.sum(20,20);//now second int literal will be promoted to long  
  obj.sum(20,20,20);  

  //40
  //60
  
  }  
}  
```



### Example of Method Overloading with Type Promotion if matching found



```java
class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);//now int arg sum() method gets invoked  
  }  
}  
```


### Example of Method Overloading with Type Promotion in case of ambiguity


```java
class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);//now ambiguity  
  }  
}  

```
