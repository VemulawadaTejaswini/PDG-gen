import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int s[]=new int[M];
		int c[]=new int[M];
		int ans[]=new int[N];
		boolean check[]=new boolean[N];
		for(int i=0;i<M;i++) {
			s[i]=sc.nextInt();
			c[i]=sc.nextInt();
			if(s[i]==1&&c[i]==0) {
				System.out.println(-1);
				System.exit(0);
			}
			if(!check[s[i]-1]) {
				ans[s[i]-1]=c[i];
				check[s[i]-1]=true;
			}else {
				if(ans[s[i]-1]!=c[i]) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		for(int i=0;i<N;i++) {
		System.out.print(ans[i]);
		}



	}
}