
public class _default {
	
	public void m1()
	{
		System.out.println("non static method call from the same class");
	}
	public static void main(String[] args) {
		_default d=new _default();
		d.m1();
		sample3 s3=new sample3();
		s3.m3();
	}
	

}
