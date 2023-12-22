import java.util.Scanner;
public class Main {
	public static int gcd(int a,int b,int c) {
		int d=0;
		int ans=0;
		while(d==0) {
		if(a>b) {
			a=a-b;
		}
		else if(a<b) {
			b=b-a;
		}
		else {
			d=a;
		}
		}
		while(ans==0) {
		if(d<c) {
			c=c-d;
		}
		else if(d>c) {
			d=d-c;
		}
		else {
			ans=d;
		}
		}
		return ans;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int A=0;
		for(int i=1;i<K+1;i++) {
			for(int j=1;j<K+1;j++) {
				for(int k=1;k<K+1;k++) {
					A+=gcd(i,j,k);
				}
			}
		}
		System.out.println(A);
	}
}
