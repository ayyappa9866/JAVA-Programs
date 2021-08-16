class InvalidStateException extends Throwable
{
InvalidStateException(String msg)
{
System.out.print("InvalidStateException:"+msg);
}
}
class Vehicle
{
String state;
void set_state(String state)
{this.state=state;}
void find() throws InvalidStateException
{
if(state=="Andhra Pradesh")
System.out.print(" vehicle Registration can be done");
else
throw new InvalidStateException(" Exception Raised -Cannot register");
}
}
class Demo
{
public static void main(String[] args) throws InvalidStateException
{
Vehicle v=new Vehicle();
v.set_state("Andhra Pradesh");
v.find();
v.set_state("And");
v.find();
}
}