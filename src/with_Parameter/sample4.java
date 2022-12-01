package with_Parameter;

public class sample4 {
	char a;
	char z;
	sample4(char o,char p)
	{
		a=o;
		z=p;
		
	}
	public void m1()
	{
		//System.out.println(a);
		//System.out.println(z);
		for(a='a';a<=z;a++)
		{
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) {
		sample4 s4=new sample4('a','z');
		s4.m1();
	}

}
