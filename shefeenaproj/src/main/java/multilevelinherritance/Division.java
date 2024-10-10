package multilevelinherritance;

public class Division extends Subtraction {
	public void div()
	{
		int e=a/b;
		System.out.println("result is"+e);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division s=new Division();
		s.add();
		s.sub();
		s.div();
	}

}
