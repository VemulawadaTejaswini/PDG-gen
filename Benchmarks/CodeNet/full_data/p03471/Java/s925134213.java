import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		for(int i = 0; i <= N; i++) {
			for(int j = 0; j + i <= N; j++) {
				int k = N - i - j;
				if(k < 0) continue;
				if(10*i+5*j+k == (Y/1000)) {
					System.out.println(i + " " + j + " " + k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}