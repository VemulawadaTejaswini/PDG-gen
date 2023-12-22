
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		double max = Math.max(a*12.5, 10*b);
		double c = max * 0.08;
		double d = max * 0.1;
		if(d - c < 1 || a * 12.5 == 10*b) {
			System.out.println((int)max);
		}
		else {
			System.out.println(-1);
		}

	}

}
