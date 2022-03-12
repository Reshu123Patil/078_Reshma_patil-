class Pattern13
{
public static void main(String args[])
{
 for(char i='A';i<='E';i++)
 {
  for(int j=1;j<='E'-i;j++)
  {
    System.out.print(" ");
  }
  for(char k='A';k<=i;k++)
  {
  System.out.print(" "+i);
  }
  System.out.println();
 }
}
}


/*   A
    B B
   C C C
  D D D D
 E E E E E  */
