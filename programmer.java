class Employee
{
 float salary=123456;
}

class programmer extends Employee
{
	float bonous=10000;
        public static void main(String args[])
       {
         programmer obj1=new programmer();
         System.out.println("SALARY="+obj1.salary);
         System.out.println("BONOUS="+obj1.bonous);
        }
}