class Student
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.print(rollno+" "+name);
}
}
class TestStudent3
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(3039,"Thejaswini");
s2.insertRecord(3048,"Jayasri");
s1.displayInformation();
s2.displayInformation();
}
}
