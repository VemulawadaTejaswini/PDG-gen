

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] ave = new int[N];

		for(int i = 0; i < M ; i++) {
			ave[sc.nextInt() - 1]++;
			ave[sc.nextInt() - 1]++;
		}
		for(int i = 0; i < ave.length; i++) {
			System.out.println(ave[i]);
		}
	}
}
