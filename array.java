import java.util.Scanner;
class arrayMain
{
public static void main(String args[])
{
int arr[]=new int[5];
Scanner input=new Scanner(System.in);
System.out.println("Enter 5 elements:");
for(int i=0;i<5;i++)
{
arr[i]=input.nextInt();
}
System.out.println("The elements are:");
for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
}
int temp;
for(int i=0;i<5;i++){
for(int j=i;j<5;j++){
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Elements after sorting:");
for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
}
int sum=0;
for(int i=0;i<5;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum="+sum);
System.out.println("Minimum value is:"+arr[0]);
System.out.println("Maximum value is:"+arr[4]);
System.out.println("Enter the element you want to search");
int search=input.nextInt();
int p=-1;
for(int i=0;i<5;i++){
if(arr[i]==search)
{
p=i;
break;
}
}
if(p>=0)
System.out.println("Element found at"+p+"th position");
else
System.out.println("Element not found");
}
}
