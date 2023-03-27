class Rect
{
int l,b,c;
Rect(int x,int y)
{
l=x;
b=y;
}
void area1()
{
c=l*b;
System.out.println("Area="+c);
}
}
class Circle
{
double pi=3.14,r,d;
Circle(double x)
{
r=x;
}
void area2()
{
d=pi*r*r;
System.out.println("Area="+d);
}
}
class Main
{
public static void main(String args[])
{
Rect a1=new Rect(10,5);
a1.area1();
Circle a2=new Circle(2);
a2.area2();
}
}
