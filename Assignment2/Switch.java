import java.util.Scanner;
class Switch 
{
   public static void main(String args[])
   {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter any choice");
	   System.out.println("1.jan 2.feb 3.mar 4.apr 5.may 6.jun 7.july");
	  int choice = sc.nextInt();
	   switch(choice)
	   {
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   System.out.println("30 days");break;
		   case 2:
		   case 4:
		   case 6:
		   System.out.println("31 days");break;
		   default : System.out.println(" enter valid month number");
		   
	   }
	   
   }
}