import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int M = scan.nextInt();

		int[] a = new int[A];
		for(int i=0;i<A;i++) {
			a[i]=scan.nextInt();
		}
		int[] b = new int[B];
		for(int i=0;i<B;i++) {
			b[i]=scan.nextInt();
		}

		int[][] m = new int[M][3];
		for(int i=0; i<M; i++) {
			for(int j=0; j<3; j++) {
				m[i][j]=scan.nextInt();
			}
		}

		int min=Integer.MAX_VALUE;
		int x,y,c,sum;
		for(int i=0; i<M; i++) {
			x= m[i][0]-1;
			y= m[i][1]-1;
			c=m[i][2];
			sum = a[x]+b[y]-c;
			if(min>sum)min=sum;
		}
		for(int i=0; i<A; i++) {
			for(int j=0; j<B; j++) {
				sum=a[i]+b[j];
				if(min>sum)min=sum;
			}
		}
		System.out.println(min);

	}

}
