import java.util.Scanner;
class F {
	public static void main(String[] args) {	 
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		if (a + b == 15) System.out.println("+");
		else if (a * b == 15) System.out.println("*");
		else System.out.println("x");
	}
}	
	
