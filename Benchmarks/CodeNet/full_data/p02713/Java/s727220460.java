import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		long ans=0;
		for(int i=1; i<=k; i++){
			for(int j=1; j<=k; j++){
				for(int t=1; t<=k; t++){
					ans+=gcd(gcd(i,j),t);
				}
			}
		}
		System.out.println(ans);
	}
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
		while(n!=0){
			long tmp=m;
			m=n;
			n=tmp%n;
		}
    return m;
}
}
