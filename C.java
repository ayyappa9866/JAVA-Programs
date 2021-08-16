class A
{
  void msg()
  {
	System.out.println("Hello");
  }
}
 class B
{
  void msg()
   {
	System.out.println("Welcome");
    }
}

class C extends A,B
{
  public static void main(String args[])
  {
    C obj1=new C();
    obj1.msg();
  }
}
   