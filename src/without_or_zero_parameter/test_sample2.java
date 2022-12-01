package without_or_zero_parameter;

public class test_sample2 {
	 int a;
	 int b;
	test_sample2()
	{
		 a=40;
		 b=20;
	}
	public void add()
	{	
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
		test_sample2 ts2=new test_sample2();
		ts2.sub();
		ts2.add();
		
		
	}
}
