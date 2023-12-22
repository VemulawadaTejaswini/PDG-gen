import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			double a = sc.nextDouble();
			int b = sc.nextInt();
			
			//calc range for a
			int minA = (int)Math.floor(a * 100 / 8);
			int maxA = (int)Math.floor((a+1) * 100 / 8);
			

			int minB = b * 10;
			int maxB = (b+1) * 10;
			
			if ( minA <= minB && minB < maxA ) {
				System.out.println(minB);
				return;
			}
			if ( minB <= minA && minA < maxB) {
				System.out.println(minA);
				return;
			}
			
			System.out.println(-1);
		}
	}
}