import java.util.Scanner;
class Exception
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
a=sc.nextInt();
System.out.println("Enter the second number:");
b=sc.nextInt();
try
{
c=a/(a-b);
System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException"+e);
}
finally
{
System.out.println("final block");
}
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("end bye");
}
}
