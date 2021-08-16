class Vechile
{
	void run()
       {
        System.out.println("Vechile is running");
       }
}
class Bike12 extends Vechile
{
	void run()
       {
        System.out.println("Bike12 is running");
       }
  public static void main(String args[])
  {
    Bike12 obj1=new Bike12();
    obj1.run();
  }
}
