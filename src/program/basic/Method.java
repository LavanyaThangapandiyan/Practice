package program.basic;

public class Method 
{		 
 private int add()
 {
	int a=50,b=20;
	int c=a+b;
	System.out.println("add is"+c);
	return c;
 }
 private void subract(int input)
 {
	input=input-10;
	System.out.println(input);
 }
 
	public static void main(String[] args) 
	{
		Method casio=new Method();
		int result=casio.add();
		casio.subract(result);
	}

}
