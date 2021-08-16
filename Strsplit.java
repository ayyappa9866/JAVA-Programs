class StrSplit
{
	public static void main(String args[])
        { 
         String s1="Hello hai how are you";
         String s2[]=s1.split("\\s");
         for(String w:s2)
         System.out.println(w);
        }
}