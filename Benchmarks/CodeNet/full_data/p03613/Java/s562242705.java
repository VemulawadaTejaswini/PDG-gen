import java.util.Scanner;

public class Main {
	static int acnt = 0, bcnt = 0;
	static boolean memo[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[100002];
		int idx = 0;
		for(int i = 0; i < n; i++) {
			idx = sc.nextInt();
			for(int j = 0; j <3; j++) {
				a[idx + j]++;
			}
		}
		int max = 0;
		for(int i = 0; i < 100002;i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println(max);
	}
}


