package without_or_zero_parameter;

public class sample6 {
	int i;
	float j;
	sample6()
	{
		i=50;
		j=40f;
	}
	public void mul()
	{
		System.out.println(i*j);
	}
	public void div()
	{
		System.out.println(i/j);
	}
	public static void main(String[] args) {
		sample6 s6=new sample6();
		s6.mul();
		s6.div();
	}
}
