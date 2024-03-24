## should be one public class in a .java file

## should have a class named same as that of script like demo.java should have public class demo

### public static void main should be there in class demo
```java

class Calculator{
    public int add(int a,int b)
    {
        return a+b;
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
        System.out.println(calc.add(num1,num2));
    }
}


```