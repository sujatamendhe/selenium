package without_or_zero_parameter;

public class test_sample3 {
	static int x=20;
	static int y=40;
	//test_sample3()
	//{
		
		
	//}
	public static void m1()
	{	System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
	public void m2()
	{
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		
		 test_sample3 ts3=new test_sample3();
		ts3.m1();
		ts3.m2();
	}
}
