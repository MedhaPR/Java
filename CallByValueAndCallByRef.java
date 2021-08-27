package OOPConceptPart1;

public class CallByValueAndCallByRef {

	int p;
	int q;
	
	int x=100;
	int y=40;
	
	public static void main(String[] args) { 
		
		CallByValueAndCallByRef  obj=new CallByValueAndCallByRef();
		
		System.out.println("call by val!");
		int sum=obj.testSum(10,20);  //call by value or pass by value:copy of a,b given to func not actual val		
		System.out.println(sum);
		
		
		System.out.println("call by ref1!");
		obj.p=70;
		obj.q=90;
		System.out.println("Bfr swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		System.out.println("Aftr swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("call by ref2!");
		int sub=obj.sub(obj);
		System.out.println(sub);
		
	}
	
	public int testSum(int a,int b) {
//		a=50;
//		b=50;
		int c=a+b;
		return c; 
	}

	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp=t.p;	//70
		t.p=t.q;	//90   
		t.q=temp;	//70
		
	}
	
	public int sub(CallByValueAndCallByRef t1) {
		int res_sub=t1.x-t1.y;
		return res_sub;
		
	}
}
