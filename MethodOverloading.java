package OOPConceptPart1;

public class MethodOverloading {

	//main method can be overloaded
	public static void main(String[] args) {
    
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
	}
	public static void main(int a) {
		
	}
	public static void main(int a,int b) {
		
}

	//method overloading: when func name is same with diff. argument within same class
	public void sum() //0 input
	{
		System.out.println("SUM method--zero param");
		
	}

	public void sum(int i) //1 input
	{
		System.out.println("Sum method --1 input param");
		System.out.println(i);
	}
	public void sum(int j,int k) //2 input params
	{
		System.out.println("Sum method --2 input param");
		System.out.println(j+","+k);
		System.out.println(j+k);
	}
}
