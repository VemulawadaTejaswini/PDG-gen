import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int L[] = new int [N];
		int D = 0;
		int kaisu = 0;
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		for(int j = 0; D <= X; j++) {
			D += L[j];
			kaisu += 1;
		}
		System.out.println(kaisu);
	}
}