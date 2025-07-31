import java.util.*;
public class AreaOfCircle
{ A
double r,result;
public double area();
{
result=2*3.14*r;
return result;
}
public static void main(String args[])
{
AreaOfCircle a=new AreaOfCircle();
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of circle:");
a.r=sc.nextDouble();
System.out.println("Area of circle is: "+a.area());
}
}


