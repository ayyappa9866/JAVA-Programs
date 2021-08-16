class MatrixAdd
{
	public static void main(String args[])
	{
	  int m1[][]={{1,2,3},{1,0,1},{2,1,1}};
          int m2[][]={{1,2,3},{1,1,1},{2,2,1}};
          int add[][]=new int[3][3];
	  for(int i=0;i<3;i++)
	  {
		for(int j=0;j<3;j++)
                {
                 add[i][j]=m1[i][j]+m2[i][j];
		 System.out.print(add[i][j]+" ");
                }
		System.out.println();
          }
        }
}
          
