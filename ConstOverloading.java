public class ConstOverloading
{
int roll;
String name;
int marks;
public ConstOverloading()
{
roll=63;
name="Sahyadri";
marks=100;
System.out.println("Name:" +name+ " Roll no:"+roll+ " Marks:" +marks);
}
public ConstOverloading(int r)
{
roll=r;
System.out.println(" Roll no:"+roll);

}
public ConstOverloading(int r,String n)
{
roll=r;
name=n;
System.out.println("Name:" +name+ " Roll no:"+roll);

}
public ConstOverloading(int r,String n,int m)
{
roll=r;
name=n;
marks=m;
System.out.println("Name:" +name+ " Roll no:"+roll+ " Marks:" +marks);

}
public static void main(String args[])
{
ConstOverloading c1=new ConstOverloading();
ConstOverloading c2=new ConstOverloading(101);
ConstOverloading c3=new ConstOverloading(102,"Sahyadri");
ConstOverloading c4=new ConstOverloading(103,"siddhi",100);

}
}






