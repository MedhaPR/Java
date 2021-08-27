package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		String x="Hello";
		String y="World";
		double c=50.2;
		double d=50.3;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);  //300HelloWorld100Hello200World
		System.out.println(c+d);
		System.out.println(x+y+c+d); //HelloWorld50.250.3
		//print: just to  print
		//println: to print o/p at new line
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
	}
}
