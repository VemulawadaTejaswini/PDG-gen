import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		int B[]=new int [N];
		B[0]=A[0];
		for(int i=1;i<N;i++) {
			B[i]=B[i-1]+A[i];
		}
		long a=Long.MAX_VALUE;
		int b=0;
		for(int i=1;i<N-2;i++) {
			if(Math.abs(B[i]-(B[N-1]-B[i]))<a) {
				a=Math.abs(B[i]-(B[N-1]-B[i]));
				b=i;
			}
		}
		long c=Long.MAX_VALUE;
		int d=0;
		for(int i=0;i<b;i++) {
			if(Math.abs(B[i]-(B[b]-B[i]))<c) {
				c=Math.abs(B[i]-(B[b]-B[i]));
				d=i;//B[d]=B,B[b]-B[d]=C
			}
		}
		long e=Long.MAX_VALUE;
		int f=0;
		for(int i=b+1;i<N-1;i++) {
			if(Math.abs((B[i]-B[b])-(B[N-1]-B[i]))<e) {
				e=Math.abs((B[i]-B[b])-(B[N-1]-B[i]));
				f=i;//B[f]-B[b]=D,B[N-1]-B[f]=E
			}
		}
		int g=B[d];
		int h=B[b]-B[d];
		int i=B[f]-B[b];
		int j=B[N-1]-B[f];
		int k,l,m,n;
		if(g>h) {
			k=g;//最大値
			l=h;//最小値
		}else {
			k=h;
			l=g;
		}
		if(i>j) {
			m=i;
			n=j;
		}else {
			m=j;
			n=i;
		}
		if(k>m) {
		}else {
			k=m;
		}
		if(l<n) {
		}else {
			l=n;
		}
		System.out.println(k-l);
	}
}