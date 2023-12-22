import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		int sum = 0;
		int a = 0;
		
		loop:
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N; j++) {
				for(int k = 0; k <= N; k++) {
					sum = 10000 * k + 5000 * j + 1000 * i;
					if((k + j + i) == N && sum == Y) {
						System.out.println(k + " " + j + " " + i);
						a++;
						break loop;
					} else if(sum > Y) {
						break;
					}
				}
			}
		}
		if(a == 0) {
			System.out.println(-1 + " " + -1 + " " + -1);
		}
	}
}
