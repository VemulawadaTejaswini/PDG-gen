import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int min = N;
		for (int i = 1; i < N; i++) {
			String a = String.valueOf(N - i);
			String b = String.valueOf(i);
			int aSum = a.chars().map(c -> c - 48).sum();
			int bSum = b.chars().map(c -> c - 48).sum();
			min = Math.min(min, aSum + bSum);
		}
		
		System.out.println(min);
	}
}