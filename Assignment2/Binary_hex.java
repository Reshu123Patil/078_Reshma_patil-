import java.util.Scanner;
class Binary_hex
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("enter the binary no=");
	String x=sc.next();
	
	int Hexadecimal=Integer.parseInt(x, 2);
	
	System.out.println(Integer.toHexString(Hexadecimal));
	
  }
}