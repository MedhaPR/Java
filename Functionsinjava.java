package OOPConceptPart1;

public class Functionsinjava {

	//main method:starting pt of execution
	public static void main(String[] args) {
		//main method is void bcz it never returns value!
		
		Functionsinjava obj=new Functionsinjava();
	    //aftr creating obj copy of all non-static methods ll be given to ths obj!
		//obj can't hold static method
		
		obj.test();
		
		int l=obj.pqr();
		System.out.println(l);
		
		String s1=obj.qa();
		System.out.println(s1);

		int m=obj.division(4,2);
		System.out.println(m);
	}
	//non static methods	
	//return type:void
	public void test() {  //no input,no output
		System.out.println("test method");
	} 
	
	//return type:int
	public int pqr() {   //no input,some output
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//return type: String
	public String qa() { //no input,some output
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
	//return type: int
	//x,y: input parameters| input arguments
	public int division(int x,int y) {
		System.out.println("division method");
		int d=x/y;
		return d;
		
	}

}
