import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int k=sc.nextInt();
			if(k==0) {
				System.out.println((long)n*n);
				return;
			}
			int res=0;
			long ans=0;
			for(int b=k+1;b<=n;b++) {
			res=n/b;
			ans+=res*(b-k);
			ans+=Math.max(n-(res*b+k-1), 0);
			}
			System.out.println(ans);
		}
	}

