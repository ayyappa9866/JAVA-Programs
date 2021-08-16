public class MyFirst {
	public static void main(String args[])
	{
		
		for(String i:args)
		{
			int result=Integer.parseInt(i);
			//System.out.println(i);
			numToWeek(result);
		}
	}
	private static void numToWeek(int n)
	{
		switch(n)
		{
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
			
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:	
			System.out.println("THRUSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
			default:
				System.out.println("Invalid");	
			
		}
	}
	

}
