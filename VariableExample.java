class VariableExample {
 static int j = n();   
static { 
System.out.println("Inside the static block"); 
}   
static int n() 
{ System.out.println("from n "); 
return 20; }   
public static void main(String[] args) {
 System.out.println("Value of j : "+j); 
System.out.println("Inside main method"); 
}}