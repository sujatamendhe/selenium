package with_Parameter;

public class sample3 {
	int i=10;
	int j=20;
	sample3(int x,int y)
	{
		i=x;
		j=y;
	}
	public void m1()
	{
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		sample3 s3=new sample3(40,30);
		s3.m1();
		sample3 s4=new sample3(30,30);
		s4.m1();
	}
}
