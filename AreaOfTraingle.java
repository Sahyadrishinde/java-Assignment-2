import java.util.*;
public class AreaOfTraingle
{
double height,base,result;
public double area()
{
result=(0.5)*height*base;
return result;
}
public static void main(String args[])
{
AreaOfTraingle a=new AreaOfTraingle();
Scanner sc=new Scanner(System.in);
System.out.println("enter the base and height:");
a.base=sc.nextDouble();
a.height=sc.nextDouble();
System.out.println("Area of triangle is: "+a.area());
}
}

