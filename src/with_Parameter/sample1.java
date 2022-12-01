package with_Parameter;

public class sample1 {
	int num1;
	int num2;
	sample1(int a,int b)
	{
		 num1= a;
		num2=b;
	}
	public void add()

	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public static void main(String[] args) {
		sample1 s1=new sample1(10,20);
		s1.add();
		s1.sub();
	}
}
