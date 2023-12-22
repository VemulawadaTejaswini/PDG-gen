import java.util.*;
public class Main{
	static int GCD(int a, int b){
		int p = Math.max(a,b);
		int q = Math.min(a,b);
		int gcd = 1;
		for( ; ; ){
			gcd = p % q;
			if(gcd==0)return q;
			if(q%gcd==0)return gcd;
			p = q;
			q = gcd;
		}
	}

	static int Skip(int k, int[] d){
		if(k==1)return d[0];
		int cgcd = GCD(d[0], d[1]);
		if(k==2)return cgcd;
		for(int i=2; i<k; k++){
			cgcd = GCD(cgcd, d[i]);
		}
		return cgcd;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] x = new int[n];
		int[] dx = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			dx[i] = Math.abs(x[i]-X);
		}
		System.out.println(Skip(n, dx));
	}
}