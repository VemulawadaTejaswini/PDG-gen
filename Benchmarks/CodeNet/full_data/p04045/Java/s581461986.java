import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K  =sc.nextInt();
		int[] D = new int[K];
		for(int i = 0 ; i < K ; i++) {
			D[i] = sc.nextInt();
		}
		LOOP:while(true) {
			String number = String.valueOf(N);
			int n = number.length();
			N++;
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < K ; j++) {
					if(number.charAt(i) == String.valueOf(D[j]).charAt(0)) {
						continue LOOP;
					}
				}
			}
			System.out.println(number);
			return;
		}
	}
}