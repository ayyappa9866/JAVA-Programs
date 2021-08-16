import java.util.Scanner;
class Student {
	
	private String id;
	private String na;
	private String pc;
	
	public boolean testID(String str)
	{
		char[] ch = new char[2];
        ch[0] = str.charAt(0); 
        ch[1] = str.charAt(1);
        String str1 = new String(ch);        

		int r = Integer.parseInt(str1);
		
		if(r>=16 && r<=19)
			return true;
		else
			return false;
	}

	public boolean testPC(String str)
	{
		char[] ch = str.toCharArray();
		if(ch[0]=='6' || ch[0]=='5')
		{
			return true;
		}else
		{	
			return false;
		}
	}


	public boolean testName(String str)
	{
		if(str==null || str.isEmpty() || str.equals(" "))
			return true;
		else
			return false;
	}

	public boolean setStudent(String i,String n,String p)
	{
		int il = i.length();
		int pl = p.length();
		if(il==9 && testID(i) && pl == 6 && testPC(p)  && !testName(n))
		{
			this.id="KLU"+i;
			this.na=n;
			this.pc=p;
			return true;
		}
		return false;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getName()
	{
		return na;
	}

	public String getPostCode()
	{
		return pc;
	}

	public String toString()
	{
		String str = String.format("Student ID : %s %nStudent Name : %s %nStudent PostCode : %s %n", id,na,pc);
		return str;
	}
	
}


public class DisplayMenu {

	private static Student arr[] = new Student[72];
	private static int count;
	private static Scanner s = new Scanner(System.in);
	
	private static int menuSelection()
	{
		System.out.println("Student Database");
		System.out.println("1. Add a Student to the Database");
		System.out.println("2. Display a Student detail");
		System.out.println("3. Display all Student detail");
		System.out.println("4. Display Student from specific code");
		System.out.println("5. Exit of the Student Database");		
		System.out.println("Enter U r choice");
		return s.nextInt();
	}
	
	private static void displayStudentID()
	{
		System.out.println("Enter Student ID");
		String stu = s.next();
		for(int i=0;i<count;i++)
		{
			System.out.println(i);
			if(arr[i].getID().equals("KLU"+stu))
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	private static void displayStudentPC()
	{
		System.out.println("Enter Student PostCode");
		String stu = s.next();
		
		for(int i=0;i<count;i++)
		{
			if(arr[i].getPostCode().equals(stu))
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	private static void displayStudentAll()
	{
		for(int i=0;i<count;i++)
		{
				System.out.println(arr[i]);
		}
	}

	
	private static void addStudent()
	{
		if(count<arr.length)
		{
			System.out.println("Enter Student ID:");
			String tid = s.next();
			System.out.println("Enter Student name:");
			String tna = s.next(); 
			System.out.println("Enter Student PostCode:");
			String tpc = s.next();
			Student st = new Student();
			if(st.setStudent(tid,tna,tpc))
			{
				arr[count++]=st;
			}
		}
		else
			System.out.println("Cannot create Student");
	}
	
	public static void main(String []args) {
		boolean repeat = true;
		int choice;
		while(repeat)
		{
			choice=menuSelection();
			switch(choice)
			{
			case 1: 
				addStudent(); 
				break;
			case 2: 
				displayStudentID(); 
				break;
			case 3:
				System.out.println(count);
				displayStudentAll(); 
				break;
			case 4: 
				displayStudentPC(); 
				break;
			default: 
				repeat=false;
			}
		}
	}
}
