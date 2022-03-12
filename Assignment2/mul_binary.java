import java.util.Scanner;
class decimal_binary
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("enter the 1st binary no=");
	String x=sc.next();
	System.out.print("enter the 2nd binary no=");
	String y=sc.next();
	int n1=Integer.parseInt(x, 2);
	int n2=Integer.parseInt(y, 2);
	int n3=n1*n2;
	System.out.println("n1="+Integer.toBinaryString(n1));
	System.out.println("n1="+Integer.toBinaryString(n2));
	System.out.println(" multiplication of n1*n2="+Integer.toBinaryString(n3));
  }
}