package without_or_zero_parameter;

public class test_sample1 {
	 int a;
	 int b;
	
	 test_sample1()
	 {
		 a=10;
		 b=20;
	 }
	 public  void m1()
	 {
		 System.out.println(a+b);
	 }
	
	 public static void main(String[] args) {
		 test_sample1 ts1=new test_sample1();
		ts1.m1();
		sample1  s=new  sample1 ();
		 s.m3();
		// ts1.m3();
	}

}
