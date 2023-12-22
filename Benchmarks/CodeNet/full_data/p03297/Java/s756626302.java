import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		long a[][]=new long[t][4];

		long gcd;
		long test;
		boolean ans;

		for(int i=0; i<t;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextLong();
			}
		}
		for(int i=0;i<t;i++) {
			if(a[i][0]<a[i][1]||a[i][1]>a[i][3]) {
				ans=false;
			}
			else if(mod(a[i][3], a[i][1])==0) {
				test=mod(a[i][0], a[i][1]);
				ans=true;
				if(test>a[i][2]) {
					ans=false;
				}
			}
			else {
				a[i][0]=mod(a[i][0], a[i][1]);
				a[i][3]=mod(a[i][3], a[i][1]);

				test=0;
				ans=true;
				test=mod(test+a[i][3], a[i][1]);
				if(test<a[i][1]&&test>a[i][2]) {
					ans=false;
				}
				test=mod(test+a[i][3], a[i][1]);
				while(ans&&test!=a[i][3]){
					if(test<a[i][1]&&test>a[i][2]) {
						ans=false;
						break;
					}
					test=mod(test+a[i][3], a[i][1]);
				}

			}


			if(ans) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

	public static long mod(long a,long b) {
		return(a%b);
	}
}
