public class Employee
{
int emp_id;
String name;
int salary;
public Employee(int id, String n, int sal)
{
emp_id=id;
name=n;
salary=sal;
System.out.println("Emp id:"+emp_id+  "Name:"+name+  "Salary:"+salary);
}
public Employee(Employee obj)
{
emp_id=obj.emp_id;
name=obj.name;
salary=obj.salary;
System.out.println("Emp id:"+emp_id+ "Name:"+name+" Salary:"+salary);
}
public static void main(String args[])
{
Employee e=new Employee(101,"Sahyadri",5000000);
Employee e1=new Employee(e);
}
}


