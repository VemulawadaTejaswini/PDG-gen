import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int mult = a * b;
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		int r = a % b;
		while(r > 0) {
			a = b;
			b = r;
			r = a % b;
		}
		
		System.out.println(mult / b);
		scan.close();
	}
}