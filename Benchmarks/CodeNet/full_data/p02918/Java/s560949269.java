import java.util.Scanner;

public class Main {
	public static int ceil(int a, int b){
		int x = (a + (b - 1))/b;
		return x;
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		int c = 0;
		int ans = 0;

		for(int i=0; i < N-1; i++) {
			if (S.charAt(i) != S.charAt(i+1)){
				c += 1;
			}
		}

		ans = N - 1 - Math.max(c - 2*K, 0);
		System.out.println(ans);
	}
}