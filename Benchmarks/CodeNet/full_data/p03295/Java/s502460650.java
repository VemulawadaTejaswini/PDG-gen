import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int B[]=new int[M];
		int C[]=new int[M];
		int f=0;
		int ans=1;
		for(int i=0;i<M;i++) {
			B[i]=sc.nextInt();
			C[i]=sc.nextInt();
		}
		for(int i=0;i<M-1;i++) {
			int d=C[i];
			int e=i;
			for(int k=i+1;k<M;k++) {
				if(d>C[k]) {
					d=C[k];
					e=k;
				}
			}
			f=B[e];
			B[e]=B[i];
			B[i]=f;
			f=C[e];
			C[e]=C[i];
			C[i]=f;
		}
		int g=C[0];
		for(int i=0;i<M;i++) {
			if(B[i]>=g) {
				ans=ans+1;
				g=C[i];
			}
		}
		System.out.println(ans);
	}
}