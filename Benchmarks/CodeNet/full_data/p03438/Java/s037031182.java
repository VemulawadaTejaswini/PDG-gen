import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		for(int i=0; i<N; ++i){
			a[i] = sc.nextLong();
			
		}
		long twos = 0;
		long minus = 0;
		for(int i=0; i<N; ++i){
			b[i] = sc.nextLong();
			if(a[i]<=b[i]) twos += (b[i]-a[i])/(long)2;
			else minus += (a[i]-b[i]);
		}
		
		if(twos>=minus) System.out.println("Yes");
		else System.out.println("No");
		return;
	}
}