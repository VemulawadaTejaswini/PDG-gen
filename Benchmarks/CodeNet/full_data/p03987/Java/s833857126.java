import java.util.*;
import java.math.*;
class Main{
	public static void main(String[] argsa){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N+1];
		for(int i=1; i<=N; i++){
			a[i]=in.nextInt();
		}
		long ans=0;
		int prevMin=N+1;
		for(int l=1; l<=N; l++){
			prevMin = N+1;
			for(int r=l; r<=N; r++){
				prevMin=Math.min(prevMin, a[r]);
				ans += prevMin;
			}
		}
		System.out.println(ans);
	}
}