
public class sample1 {
	int a;
	int b;
	
	sample1()
	{
		a=10;
		b=20;
		
	}
	public void m1()
	{
		System.out.println(a+b);
	}
	public void m2()
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		sample1 s=new sample1();
		s.m1();
		s.m2();
		
	}
	
	

}
