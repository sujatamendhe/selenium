package without_or_zero_parameter;

public class test_sample4 {
	int i;
//	int j;
	test_sample4()
	{
		i=62;
		//j=5;
	}
	public void m1()
	{
			//else
		//	{
			//	System.out.println("fail");
		//	}
			if(i>=65)
			{
				System.out.println("disction");
			}
			else if(i>=60& i<=64  )
				{
					System.out.println("1st class");
				}
			else if(i>=50&i<=59)
			{
				System.out.println("2nd class");
			}
			else if(i>=40&i<=49)
			{
				System.out.println("3rd class");
			}

			else if(i>=35&i<=39)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
				
	}
	public static void main(String[] args) {
		
		test_sample4 st4=new test_sample4();
		st4.m1();
	}
	

}
