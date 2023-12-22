import java.util.Scanner;

public class Main {
	static int solve(int N , int s[] , int c[]){
		for(int n = 0 ; n <= 1000 ; ++n){
			String st = String.valueOf(n);
			if(st.length() != N){
				continue;
			}
			boolean f = true;
			for(int i = 0 ; i < s.length ; ++i){
				if(st.charAt(s[i] - 1) - '0' != c[i]){
					f = false;
				}
			}
			if(f)return n;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int s[] = new int[M];
		int c[] = new int[M];
		for(int i = 0 ; i < M ; ++i){
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		System.out.println(solve(N, s, c));
	}
}
