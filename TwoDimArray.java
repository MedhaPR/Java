package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][]=new String[3][5];
		
		System.out.println(x.length);  //3 --total no. rows
		System.out.println(x[0].length); //5 --total no. cols
		
		System.out.println("*****");
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		x[1][0]="f1";
		x[1][1]="g1";
		x[1][2]="h1";
		x[1][3]="i1";
		x[1][4]="j1";

		x[2][0]="k2";
		x[2][1]="l2";
		x[2][2]="m2";
		x[2][3]="n2";
		x[2][4]="o2";
		
		//print all the val of 2d array
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[0].length;c++)
			{
				System.out.print(x[r][c]+" ");
			}
			System.out.println();		}
	}

}
