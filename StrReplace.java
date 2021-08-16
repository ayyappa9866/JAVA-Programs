class StrReplace
{
	public static void main(String args[])
	{
	  String s1="Hello Welcome to Java";
          String s2=s1.replace('o','#');
          String s3="Welcome To Java Programming Java Hai Java";
          String s4=s3.replaceAll("Java","*");
          System.out.println(s2);
          System.out.println(s4);
       }
}