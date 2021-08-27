package OOPConceptPart1;

public class StaticAndNonstaticConcept {
	String name="Medha";  //non-static global var
	static int age=27;    //static global var

	public static void main(String[] args) {

		StaticAndNonstaticConcept obj=new StaticAndNonstaticConcept();
		
		//non-static var,func called through obj
		System.out.println("Calling non-staic func,var!");
		obj.sendMail();
		System.out.println(obj.name); 
		
		
		// static func,var can called directly!
		System.out.println("Calling static func,var directly!");
		sum();
		System.out.println(age);
		
		//can be called using class name!
		System.out.println("Calling static func,var using class name!");
		StaticAndNonstaticConcept.sum();
		System.out.println(StaticAndNonstaticConcept.age);
		
		System.out.println();
		
}
	
	public void sendMail() //non-static method
	{
		System.out.println("send mail method");
	}
	
	public static void sum() //static method
	{
		System.out.println("Sum method");
	}

}
