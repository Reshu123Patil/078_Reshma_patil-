class Pyramid6
{
  public static void main(String args[])
  {
    for(int i=1;i<=9;i++)
	{
	  for(int j=1;j<=i;j++)
	  {
	    System.out.print(" ");
	  }
	 for(int k=1;k<=10-i;k++)
	 {
	  System.out.print(" "+k);
	 }
	 System.out.println();
	}
  }
}
  1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7 8
    1 2 3 4 5 6 7
     1 2 3 4 5 6
      1 2 3 4 5
       1 2 3 4
        1 2 3
         1 2
          1
