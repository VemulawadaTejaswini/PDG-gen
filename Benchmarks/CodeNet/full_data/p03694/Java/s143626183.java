import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int minDistance = 0;
		int min = 1000;
		int max = 0;
		for(int i = 0  ; i  < N ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i ++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		minDistance = max - min;
		System.out.println(minDistance);
	}
}
