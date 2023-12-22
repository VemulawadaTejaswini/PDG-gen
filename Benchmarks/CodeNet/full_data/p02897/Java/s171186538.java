import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		double p = 0;
		for(int i = 1; i <= N; i++) {
			if(i%2 == 1) {
				count++;
			}
		}
		p = (double)count / N;
		System.out.println(p);
		sc.close();
	}

}
