package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global vars --class variables: scope throughout my pgm
	String name="Tom";
	int age=25;
	 
	public static void main(String[] args) {
		int i=10; //local var of main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);   //Global vars ll be accessed through obj
        System.out.println(obj.age);
        
	}
	
	public void sum() {
		int i=15; //local var of sum method
		int j=20;
		
	}

}
