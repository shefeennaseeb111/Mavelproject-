package inherritance;

public class Child extends Parent {
	public void sub()
	{
		int c=a-b;
		System.out.println("difference is"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child s=new Child();
    s.add();
    s.sub();
	}

}