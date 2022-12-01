package with_Parameter;

public class sample5 {
char a;
sample5(char b)
{ a=b;
	}
	public void m1()
	{
		if(a>='a'&&a<='z')
		{
			System.out.println("char in lower case");
			
		}
		else if(a>'A'&&a<='z')
		{
			System.out.println("char in uppercase");
		}
		else
		{
			System.out.println("char not found");
		}
	}
	public static void main(String[] args) {
		sample5 s5=new sample5('a');
		s5.m1();
		
		
	}

}
