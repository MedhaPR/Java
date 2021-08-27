package OOPConceptPart1;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//data conversion frm String to int
		int i=Integer.parseInt(x);   //used wrapper class Integer!
	    System.out.println(i+20);
	    
	    //Integer, Double, Character, Boolean
	    
	    System.out.println("*****");
	    String x1="99.99";
	    System.out.println(x1+0.11);
	    //data conversion frm string to double
	    double d=Double.parseDouble(x1);
	    System.out.println(d+0.11);
	    

	    System.out.println("*****");
	    String x2="true";
	    //data conversion frm string to boolean
	    Boolean b=Boolean.parseBoolean(x2);
	    System.out.println(x2);
	    
	    //int to string conversion
	    System.out.println("*****");
	    int i1=100;
	    System.out.println(i1+10);
	    
	    String s1=String.valueOf(i1);
	    System.out.println(s1+10);

	    String u="100a";
	    Integer.parseInt(u); //NumberFormatException if input string: 100a
	    
	}
	
}


