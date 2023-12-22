import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), Z = sc.nextInt(), W = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		sc.close();
		
		int ans = 0;
		
		if(N==1) {
			ans = Math.abs(W - a[N-1]);
			System.out.println(ans);
			return;
		}
		
		if(Math.abs(W - a[N-1]) >= Math.abs(a[N-1] - a[N-2])) ans = Math.abs(W - a[N-1]);
		else ans = Math.abs(Math.abs(a[N-1] - a[N-2]));
		
		System.out.println(ans);
		
		
	}
}