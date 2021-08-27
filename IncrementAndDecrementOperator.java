package JavaBasics;
public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//++
		//--
		int i=1;
		System.out.println(i);
		int j=i++; //post increment

		System.out.println(i);
        System.out.println(j);
        
        System.out.println("*****");
        
        int a=1;
        System.out.println(a);
        int b=++a;  //pre increment
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println("****");
        int x=2;
        System.out.println(x);
        int y=x--;  //post decrement
        System.out.println(x); //1
        System.out.println(y); //2
        
        System.out.println("*****");
        int p=2;
        System.out.println(p);
        int q=--p;  //pre decrement
        System.out.println(p);  //1
        System.out.println(q);  //1
	}

}
