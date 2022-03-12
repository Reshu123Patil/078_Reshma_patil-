class PatternStar9
{
  public static void main(String[] args)
  {
    for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=5-i;j++)
	  {
	    System.out.print(" ");
	  }
	  for(int k=1;k<=i;k++)
	  {
	    System.out.print("*");
	  }
	  System.out.println();
	}
	for(int l=1;l<=4;l++)
	{
		for(int h=1;h<=l;h++)
		{
		  System.out.print(" ");
		}
		for(int g=1;g<=5-l;g++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }

}/* *
   **
  ***
 ****
*****
 ****
  ***
   **
    *  */