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

