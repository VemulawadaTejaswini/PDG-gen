import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		long[] list=new long[N];
		for(int i=0;i<N;i++){
			list[i]=sc.nextInt();
		}
		//１回で取れる個数
		long pick=N*(N+1)/2;
		
		long sum=0;
		for(int i=0;i<N;i++){
			sum=sum+list[i];
		}
		if(sum%pick!=0){
			System.out.println("NO");
			return;
		}
		//総ピック回数
		long count=sum/pick;
		for(int i=1;i<N;i++){
			if(((list[i]-list[i-1])-count)%N!=0){				
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}
}