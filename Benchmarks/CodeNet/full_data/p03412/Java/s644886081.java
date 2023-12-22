import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>10000){
			System.out.println(0);
			return;
		}
		
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i=0;i<N;++i) a[i] = sc.nextInt();
		for(int i=0;i<N;++i) b[i] = sc.nextInt();
		
		int ans = 0;
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				ans = ans^(a[i]+b[j]);
			}
		}
		System.out.println(ans);
		return;
	}
}