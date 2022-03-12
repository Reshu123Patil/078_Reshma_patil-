import java.util.Scanner;
class Binary_dec
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("enter the decimal no=");
	String x=sc.next();
	
	int decimal=Integer.parseInt(x, 2);
	
	System.out.println(decimal);
	
  }
}