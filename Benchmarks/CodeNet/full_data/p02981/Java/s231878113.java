import java.util.Scanner;

public class Main{
	static long a;
	static long b;
	static long x;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a * n > b) {
			System.out.println(b);
		}else {
			System.out.println(a * n);
		}
	}
}
