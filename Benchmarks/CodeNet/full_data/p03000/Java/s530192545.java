

import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] L = new int[n];
		for(int i = 0; i < n; i++) {
			L[i] = sc.nextInt();
		}
		int ans = 1;
		int jmp = 0;
		for(int i = 0; i < n; i++) {
			jmp += L[i];
			if(jmp <= x) {
				ans ++;
			}
		}
		System.out.println(ans);
		sc.close();
	}


}
