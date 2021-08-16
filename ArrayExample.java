class ArrayExample
{
private static int a[]={10,20,30,40,50};
public static void main(String ar[])
{
System.out.println(sum());
}
private static int sum()
{
int s=0;
for(int i:a)
s+=i;
return s;
}
}