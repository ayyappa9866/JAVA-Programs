class Constructor1
{
 int id;
 String name;
 int age;
 Constructor1(int i,String s)
 {
  id=i;
  name=s;
 }
 Constructor1(int i,String s,int a)
 { 
  id=i;
  name=s;
  age=a;
 }
     void display()
     {
     System.out.println("ID="+id+" "+"Name="+name+" "+"Age="+age);
      }
   public static void main(String args[])
   {
     Constructor1 s1=new Constructor1(123,"ABC");
     Constructor1 s2=new Constructor1(145,"CDE",25);
     s1.display();
     s2.display();
   }
}