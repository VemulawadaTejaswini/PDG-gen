import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
		}
		int point = 1;
		for(int i = 0 ; i < N ; i++) {
			point = a[point - 1];
			if(point == 2) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);
	}
}
