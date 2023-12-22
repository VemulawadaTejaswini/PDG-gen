import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][2];
		for(int i=0;i<N;++i){
			a[i][0] = sc.nextInt();
			a[i][1] = i; 
		}
		Arrays.sort(a, (x, y) -> Integer.compare(x[0],y[0]));

		boolean[] mita = new boolean[N];
		long ans = 0;
		for(int i=0;i<N;++i){
			long min = a[i][0];
			int index = a[i][1];
			int left = index;
			int right = index;
			while(left>0&&!mita[left-1]) left--;
			while(right<N-1&&!mita[right+1]) right++;
			ans += (long)(index-left+1) * (long)(right-index+1) * min;
			mita[index] = true;
		}
		System.out.println(ans);
		return;
	}
}