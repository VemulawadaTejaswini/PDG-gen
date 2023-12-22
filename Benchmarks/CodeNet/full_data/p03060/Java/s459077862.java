

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		int c[] = new int [n];
		int max = 0;
		
		for(int i = 0;i < n;i++) {
			v[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++) {
			c[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++) {
			int tmp = max + v[i] - c[i];
			if(tmp > max) {
				max = tmp;
			}
		}
		System.out.println(max);
	}
}
