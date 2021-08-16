class StudentTest
{
	int id;
	String name;
	StudentTest(int i,String n)
	{
	  id=i;
	  name=n;
        }
        void display()
        {
	 System.out.println(id+" "+name);
	}
   public static void main(String args[])
    {
      StudentTest s1=new StudentTest(12,"abc");
      StudentTest s2=new StudentTest(13,"xyz");
      s1.display();
      s2.display();
     }
}