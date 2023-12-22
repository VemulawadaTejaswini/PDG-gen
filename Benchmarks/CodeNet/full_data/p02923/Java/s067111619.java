import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] h = new long[N];
		for( int i=0; i<N; i++ ){
			h[i] = sc.nextLong();
		}
		int count = 0,maxium = 0;
		for( int i=1; i<N; i++ ){
			if( h[i]<=h[i-1] ){
				count++;
            }              
			if( h[i]>h[i-1] || i==N-1 ){
				maxium = Math.max(maxium,count);
				count = 0;
			}        
		}
		System.out.println(maxium);
	}
}
