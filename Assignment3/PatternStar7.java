class PatternStar7
{
  public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)
	 {
	   for(int j=1;j<=5-i;j++)
	   {
	     System.out.print(" ");
	   }
	   for(int k=1;k<=2*i-1;k++)
	   {
	     System.out.print("*");
	   }
	   System.out.println();
	 }
	 for(int l=4;l>=1;l--)
	 {
		for(int h=1;h<=5-l;h++)
		{
           System.out.print(" ");
        }	
       for(int y=1;y<=2*l-1;y++)	
	   {
          System.out.print("*");
	   }	
      System.out.println();	   
	 }
   }
}

 /* *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *    */
