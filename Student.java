public class Student
{
int roll;
String name;
int marks;
public Student(int roll, String name, int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;
}
public void display()
{
System.out.println("Roll_name: "+roll+"  Name: "+name+    "  Marks: "+marks);
}
public static void main(String args[])
{
Student s=new Student(63,"Sahyadri",100);
s.display();
}
}
