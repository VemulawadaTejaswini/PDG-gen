import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int min = 1;
		
		for(int i = 0; i < N; i++) {
			if(min + K > min * 2) {
				min *= 2;
			} else {
				min += K;
			}
		}
		System.out.println(min);
	}
}
