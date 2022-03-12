class PatternStar12
{
 public static void main(String args[])
 {
   for(int i=5;i>=1;i--)
   {
     for(int j=1;j<=i;j++)
	 {
	  System.out.print("*");
	 }
	 System.out.println();
   }
     for(int k=2;k<=5;k++)
	 {
		 
		for(int u=1;u<=k;u++ )
		{
			System.out.print("*");
		}
		System.out.println();
	 }
   
 }
}
/*
*****
****
***
**
*
**
***
****
*****
*/