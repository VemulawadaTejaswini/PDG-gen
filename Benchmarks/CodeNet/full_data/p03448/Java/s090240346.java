import java.util.*;

public class Main {

	public static void main(String[] args) {


		int A = 0;
		int B = 0;
		int C = 0;
		int X = 0;
		int difference = 0;
		int judge = 0;
		Scanner scanner = new Scanner(System.in);

		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		X = scanner.nextInt();

		for(int i = 0; i < A; i++) {
			for(int j = 0; j < B; j++) {
				for(int k = 0; k < C; k++) {
				difference = X -(500*i + 100*j);
				if(difference >= 0 && difference % 50 ==0 && difference/50 <k) {judge++;}
				}
			}
		}
		System.out.println(judge);
	}
}
