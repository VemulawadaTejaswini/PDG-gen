import java.util.Scanner;

/**
 * https://abc047.contest.atcoder.jp/tasks/abc047_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int l = 0;
		int r = W;
		int b = 0;
		int t = H;
		for(int i=0; i<N; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			switch(a){
			case 1: l = Math.max(l, x); break;
			case 2: r = Math.min(r, x); break;
			case 3: b = Math.max(b, y); break;
			case 4: t = Math.min(t, y); break;
			}
		}
		sc.close();
		
		System.out.println(Math.max(0,r-l)*Math.max(0,t-b));

	}

}