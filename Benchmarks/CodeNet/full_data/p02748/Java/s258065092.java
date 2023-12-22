import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int m = scan.nextInt();
		int min = Integer.MAX_VALUE;
		int[] a = new int[A];
		int ans = 0;
		for(int i = 0;i < A; ++i){
			a[i] = scan.nextInt();
			min = Math.min(a[i],min);
		}
		ans += min;
		min = Integer.MAX_VALUE;
		int[] b = new int[B];
		for(int i = 0;i  < B; ++i){
			b[i] = scan.nextInt();
			min = Math.min(b[i],min);
		}
		ans += min;
		for(int i = 0;i < m; ++i){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int c = scan.nextInt();
			ans = Math.min(ans, a[x-1]+b[y-1]-c);
		}
		System.out.print(ans);

	}
}
