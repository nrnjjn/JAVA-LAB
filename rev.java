import java.util.Scanner;
class Rev
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int rev=0,rem;
System.out.println("Enter the number");
int number=input.nextInt();
while(number!=0)
{
rem=number%10;
rev=rev*10+rem;
number=number/10;
}
System.out.println(rev);
}
}

