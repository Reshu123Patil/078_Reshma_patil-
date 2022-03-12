class Pattern10
{
  public static void main(String args[])
  {
    for(char i='A';i<='E';i++)
	{
	  for(int j=1;j<='E'-i;j++)
	  {
	    System.out.print(" ");
	  }
	for(char k='A';k<='E';k++)
       {
          System.out.print(" "+k);
       }	
System.out.println();	   
	}
	
  }
}