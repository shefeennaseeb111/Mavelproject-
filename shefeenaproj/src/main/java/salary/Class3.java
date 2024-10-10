package salary;

public class Class3 extends Class2 {
	int t;
	public void total()
	{
		t=a-b+c+h-p;
		System.out.println("Total salary is"+t);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 s=new Class3();
		s.display();
		s.calc();
		s.total();
	}

}
