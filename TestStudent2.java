class Student
{
int id;
String name;
}
class TestStudent2
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=3039;
s1.name="Thejaswini";
s2.id=3048;
s2.name="Jayasri";
System.out.println(s1.id+"\n"+s1.name);
System.out.println(s2.id+"\n"+s2.name);
}
}
