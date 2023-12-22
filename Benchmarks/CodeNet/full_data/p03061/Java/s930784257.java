import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a = new long[n];
		long ans=0;
		long[] front=new long[n];
		long[] back=new long[n];
		for(int i = 0; i<n; i++){
			a[i]= sc.nextLong();
		}
		front[0]=a[0];
		back[n-1]=a[n-1];
		for(int i = 1; i<n; i++){
			front[i]=gcd(a[i],front[i-1]);
			back[n-1-i]=gcd(back[n-i],a[n-1-i]);
		}
		for(int i = 0; i<n; i++){
			if(i==0){
				ans=Math.max(ans,back[1]);
			}else if(i==n-1){
				ans=Math.max(ans,front[n-2]);
			}else{
				ans=Math.max(ans,gcd(front[i-1],back[i+1]));
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
