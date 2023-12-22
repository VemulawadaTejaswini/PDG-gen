import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();

		int a=0;
		int sum=100000;
		int[][] m=new int[2][5];

		for(a=0;a<=n/2;a++) {
			int a1=a;
			int b1=n-a;
			for(int j=4;j>=0;j--) {
				if(a1/Math.pow(10, j)<1) {
					m[0][j]=0;
				}else {
					m[0][j]=(int)Math.floor(a1/Math.pow(10, j));
					a1-=(int)Math.floor(a1/Math.pow(10, j))*Math.pow(10, j);
				}
				if(b1/Math.pow(10, j)<1) {
					m[1][j]=0;
				}else {
					m[1][j]=(int)Math.floor(b1/Math.pow(10, j));
					b1-=(int)Math.floor(b1/Math.pow(10, j))*Math.pow(10, j);
				}
			}

			int sum1=0;

			for(int k=0;k<5;k++) {
				sum1+=(m[0][k]+m[1][k]);
			}
			if(sum1<sum) {
				sum=sum1;
			}
		}

		System.out.println(sum);
	}

}
