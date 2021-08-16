class Multi3 implements Runnable
{  
public void run()
{  
for(int i=1;i<5;i++)
{  
try
{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e);
}  
System.out.println(i);  
}    
}   
public static void main(String args[])
{  
Multi3 m1=new Multi3(); 
Multi3 m2=new Multi3(); 
Thread t1 =new Thread(m1);
Thread t2 =new Thread(m2);  
t1.start();
t2.start();  
}  
}  