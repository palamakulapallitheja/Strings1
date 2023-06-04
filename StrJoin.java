public class StrJoin
{
public static void main(String args[])
{
String s1=new String("hello");
String s2=new String("world");
String s=String.join("#",s1,s2);//string 3 to store the result
System.out.println(s.toString());//display result
}
}