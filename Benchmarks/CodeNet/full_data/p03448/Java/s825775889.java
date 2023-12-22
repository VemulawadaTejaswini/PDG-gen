import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int fiveHundred = sc.nextInt();
			int hundred = sc.nextInt();
			int five = sc.nextInt();
			int x = sc.nextInt();
			int result = 0;
			for (int i = 0 ; i <= fiveHundred; i++) {
				for (int j = 0 ; j <= hundred ; j++) {
					for (int k=0; k <=five; k++) {
						if(i*500+j*100+50*k == x) {
							result++;
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}