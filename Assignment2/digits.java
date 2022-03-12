class digits
{
  public static void main(String args[])
  {
    int n=54321;

	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	int e=d%10;
	int f=d/10;
	int g=f%10;
	int h=f/10;
	
	System.out.print(+h);
	System.out.print(  +g);
	System.out.print(  +e);
	System.out.print(c);
	
	
		System.out.print(+a);
  }
}