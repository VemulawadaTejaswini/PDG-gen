import java.util.Scanner;
public class Main {

@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int K=sc.nextInt();
	long ans=0;
	for(long i=1;i<=K;i++) {
		for(long j=1;j<=K;j++) {
			for(long k=1;k<=K;k++) {
				ans+=gcd(gcd(i,j),k);
			}
		}
	}
	System.out.println(ans);
}

private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
