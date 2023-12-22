import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long h[] = new long[N];
		
		for(int i=0; i<N; i++){
			h[i]=sc.nextLong();
		}
		
		long answer = binarytree(0,Long.MAX_VALUE,A,B,N,h);
		System.out.println(answer);
	}
	
	public static long binarytree(long startrange, long endrange, long A,long B,int N,long h[]){
		if(startrange>endrange) return startrange;
		long mid = (startrange+endrange)/2;
		if(kansuu(mid,A,B,N,h)){
			return binarytree(startrange,mid-1,A,B,N,h);
		}
		else{
			return binarytree(mid+1,endrange,A,B,N,h);
		}
	}
	public static boolean kansuu(long T,long A,long B,int N,long h[]){
		long times=0;
		for(int i=0; i<N; i++){
			double U =((double)(h[i]-B*T))/((double)(A-B));
			double Y = Math.ceil(U);
			if(Y>0){
				times = times + (int)Y;
			}
		}
		if(times<=T) return true;
		else return false;
	}
}