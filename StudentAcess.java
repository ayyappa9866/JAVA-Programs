class Student123
{
  int rollno;
  String name;
  static String cname="KLU";
   Student123(int r,String n)
  {
   rollno=r;
   name=n;
   }
    void display()
    {
     System.out.println(rollno+" "+name+" "+cname);
    }
}
class StudentAcess
{
   public static void main(String args[])
   {
    Student123 s1=new Student123(1,"ABC");
    Student123 s2=new Student123(2,"CDE");
    Student123 s3=new Student123(3,"Hello");
    Student123.cname="VRSEC";
    s1.display();
    s2.display();
    s3.display();
   }
}