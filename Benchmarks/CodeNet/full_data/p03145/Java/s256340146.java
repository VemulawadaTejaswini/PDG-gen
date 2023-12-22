package rightriangle;

import java.util.Scanner;

class RightTriangle {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = Math.abs(sc.nextInt());
		int b = Math.abs(sc.nextInt());
		int c = Math.abs(sc.nextInt());
		if(!(a*a + b*b != c*c))
			System.out.print(a*b/2);
		
	}
}
