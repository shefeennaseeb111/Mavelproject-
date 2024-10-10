package heirarchichal;

public class ClassC extends ClassA {
	public void mult()
	{
		int x=a*b;
		System.out.println("The product is "+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC t=new ClassC();
		t.add();
		t.mult();
	}

}
