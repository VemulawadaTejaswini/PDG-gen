import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();
		long max=0;
		if(N==2){
			max=Math.max(A[0],A[1]);
		}else{
			for(int i=0;i<N;i++)max=Math.max(max,gcd(A,i));
		}
		System.out.println(max);
	}

	public static final long gcd(long[] v,int j) {
		int len = v.length;
		long g=0;
		if(j==0){
			g = gcd(v[1], v[2]);
		}else if(j==1){
			g = gcd(v[0], v[2]);
		}else{
			g = gcd(v[0], v[1]);
		}
		for (int i=1;i<len-1;i++){
			if(j==i+1)continue;
			g = gcd(g, v[i+1]);
		}
		return g;
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
