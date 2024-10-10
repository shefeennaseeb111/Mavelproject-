package heirarchichal;

public class ClassB extends ClassA {
	public void sub()
	{
	int d=a-b;
	System.out.println("Difference is"+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB s=new ClassB();
		s.add();
		s.sub();
		
	}

}
