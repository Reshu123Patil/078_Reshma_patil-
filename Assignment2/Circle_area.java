import java.util.Scanner;
class Circle_area
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the  radius");
	int radius=sc.nextInt();
	double pi=3.14;
	double area=pi*radius*radius;
	System.out.println("Area of circle="+area);
  }
}