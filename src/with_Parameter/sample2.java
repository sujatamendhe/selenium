package with_Parameter;

public class sample2 {
	String i;
	String j;
	sample2(String nm1,String nm2)
	{
		i=nm1;
		j=nm2;
	}
	public void m1()
	{
		System.out.println("name1: "+i +""+" name2: "+j);
	}
	public static void main(String[] args) {
		sample2 s2=new sample2("pratyusha","viha");
		s2.m1();
	}
}
