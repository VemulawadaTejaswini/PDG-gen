import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) p[i] = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i + 1 < n; i++) {
			int max = Math.max(Math.max(p[i], p[i + 1]), p[i - 1]);
			int min = Math.min(Math.min(p[i], p[i + 1]), p[i - 1]);
			int mid = p[i] ^ p[i + 1] ^ p[i - 1] ^ max ^ min;
			if(mid == p[i]) cnt++;
		}
		System.out.println(cnt);
	}
}