import java.util.Scanner;
class table_x
   {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	     System.out.println("enter any no.");
		 int num=sc.nextInt();
		 for(int i=1;i<=10;i++)
		 {
		    int t=num*i;
			System.out.println(t);
		 }
	}
   }