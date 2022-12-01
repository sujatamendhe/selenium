package without_or_zero_parameter;

public class sample7 {
	int i;
	int j;
	sample7()
	{
		i=20;
		j=40;
	}
	public void sum()
	{
		System.out.println("addition: "+(i+j));
		
	}
	public static void main(String[] args) {
		sample7 s7=new sample7();
		s7.sum();
	}

}
