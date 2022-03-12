import java.util.Scanner;
class multiplication

{
  public static void main(String args[]) 
  {
     Scanner s1=new Scanner(System.in);
	 System.out.println("enter a first no.=");
	 int a= s1.nextInt();
	 System.out.println("enter a second no.=");
	 int b=s1.nextInt();
	 
	 System.out.println("multiplication of two nos="+(a*b));
  }
}