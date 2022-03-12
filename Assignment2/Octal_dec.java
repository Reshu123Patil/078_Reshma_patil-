import java.util.Scanner;
class Octal_dec
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("enter the binary no=");
	String x=sc.next();
	
	int decimal=Integer.parseInt(x, 8);
	
	System.out.println(decimal);
	
  }
}