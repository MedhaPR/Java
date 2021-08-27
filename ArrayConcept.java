package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//a)int array
		//upper bound=n-1 (n is size of array)=4-1=3
		//lower bound=0
				
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[3]);
//		System.out.println(i[4]); //ArrayIndexOutOfBoundException
		System.out.println(i.length);
		
		System.out.println("*****");
		//print all the values of array
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}

		System.out.println("*****");
	    //b)double array:
		double d[]=new double[3];
		d[0]=12.11;
		d[1]=50.99;
		d[2]=99.99;
		
		System.out.println(d[2]);
		
		System.out.println("*****");
		//c)char array
		
		char c[]=new char[3];
		c[0]='M';
		c[1]='9';
		c[2]='$';
		
		System.out.println(c[2]);
		System.out.println(c[1]);
		
		System.out.println("*****");
		//d)boolean array
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=false;
		b[2]=true;
		
		System.out.println(b[2]);
		
		System.out.println("*****");
		//e)string array
		
		String s[]=new String[3];
		s[0]="Hello";
		s[1]="World";
		s[2]="Bye";
		System.out.println(s[0]);;
		System.out.println(s.length);
		
		System.out.println("*****");
		//object array is used to store diff. data type values!
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]="12.33";
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		System.out.println(ob[5]);
		System.out.println(ob.length);
		for(int k=0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
	}

}


