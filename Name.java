import java.util.Scanner;
public class Name{
private static String fname;
private static String lname;
public static void main(String args[])
{
System.out.print("Enter fullname name=");
Scanner sc=new Scanner(System.in);
fname=sc.next();
lname=sc.next();
System.out.println("First name="+fname);
System.out.println("Last name="+lname);
sc.close();
}
}