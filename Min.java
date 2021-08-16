class Min
{
	public static void main(String args[])
        { 
          int arr[]={2,5,8,1,6,4,3,9,7,10};
          int minimum=arr[0];
          for(int i=1;i<arr.length;i++)
          {
            if(arr[i]<minimum)
            minimum=arr[i];
          }
         System.out.println(minimum);
        }
}