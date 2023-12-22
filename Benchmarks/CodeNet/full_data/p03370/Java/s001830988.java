import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int[] m=new int[N];
		int ans=N;
		int min=0;

		for(int i=0;i<N;i++){
			m[i]=sc.nextInt();
			X-=m[i];
			if(i==0){
				min=m[i];
			}else{
				min=Math.min(min,m[i]);
			}
		}

		if(X==0){
			System.out.println(ans);
		}else{
			ans+=X/min;
			System.out.println(ans);
		}
		
	}
}