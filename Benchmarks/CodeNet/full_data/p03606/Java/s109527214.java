import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] l = new int[N];
		int[] r = new int[N];
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			sum += r[i] - l[i] + 1;
		}
		
		System.out.println(sum);
		
	}
}
