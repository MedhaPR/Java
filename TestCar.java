package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static|compile time polymerphism
		BMW b=new BMW();
		b.start();  	
		b.stop();			//inherited frm parent		   
		b.refuel();		
		b.theftSafety(); 		
		b.Engine();
		
		System.out.println("*****");
	    Car c=new Car();
		c.start();
		c.refuel();
		c.stop();	
		
		System.out.println("*****");
		//Top casting
		Car c1=new BMW();  //child class obj can be referred by parent class reference variable: dynamic|run time polymerphism!
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
		 //Down casting is not allowed
//		 BMW b1=new Car();
//		 BMW b1=(BMW)new Car();
		 
	}

}
