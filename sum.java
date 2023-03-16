import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int digit,sum=0;
System.out.println("Enter the number");
int num=input.nextInt();
while(num!=0)
{
digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.println("Sum of digits=" +sum);
}
}



