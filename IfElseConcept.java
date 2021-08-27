package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater than b!");
		}
		else {
			System.out.println("b is greater than a!");
		}
	
	
	//comparision operators: <,>,<=,>=,==,!=
	int c=40;
	int d=40;
	
	if(c!=d) {
		System.out.println("c,d are not equal!");
	}
	else {
		System.out.println("c,d are equal!");
	}

	//Write a logic to find out highest no!
	int a1=30,b1=20,c1=10;
	
	if(a1>b1 & a1>c1)
	{
		System.out.println("a1 is highest no");
	}
	else if(b1>c1)
	{
		System.out.println("b1 is highest no");
	}
	else {
		System.out.println("c1 is highest no");
	}
	
	//Write logic to find smallest no
	if (a1<b1 & a1<c1)
	{
		System.out.println("a1 is smallest no");
	}
	else if(b1<c1)
	{
		System.out.println("b1 is smallest no");
	}
	else {
		System.out.println("c1 is smallest no");
	}
	
}}
