import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0; i < N; i++)
			x[i] = Math.abs(X - sc.nextInt());
		
		int min = x[0];
		for(int i = 1; i < N; i++) {
			int a = x[0];
			int b = x[i];
			int r;
			while((r = a % b) != 0) {
				a = b;
				b = r;
			}
			if(min > b)
				min = b;
			
		}
		System.out.println(min);
	}
}