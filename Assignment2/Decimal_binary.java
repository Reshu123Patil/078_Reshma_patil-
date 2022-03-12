import java.util.Scanner;
class Decimal_oct
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("enter the 1st decimal no=");
	String x=sc.next();
	
	int dec=Integer.parseInt(x, 10);
	
	System.out.println("n1="+Integer.toBinaryString(dec));
	
  }
}