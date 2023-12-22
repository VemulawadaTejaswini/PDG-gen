import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(a+b>=n+2) {
				System.out.println(-1);
				return;
			}
			if(a==1) {
				if(n>1&&b==1) {
					System.out.println(-1);
					return;
				}
				for(int i=n;i>n-b+1;i--) {
					System.out.print(i+" ");
				}
				for(int i=1;i<=n-b+1;i++) {
					System.out.print(i+" ");
				}
				
				return;
			}
			
			for(int i=b;i>0;i--) {
				System.out.print(i+" ");
			}
			for(int i=n-a+2;i<=n;i++) {
				System.out.print(i+" ");
			}
			for(int i=n-a+1;i>b;i--) {
				System.out.print(i+" ");
			}
			
		}
	}

