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

		int min=Integer.MAX_VALUE;
		int x,y,c;
		for(int i=0; i<A; i++) {
			for(int j=0; j<B; j++) {
				min = Math.min(min, a[i]+b[j]);
			}
		}

		int[][] m = new int[M][3];
		for(int i=0; i<M; i++) {
			x = scan.nextInt()-1;
			y = scan.nextInt()-1;
			c = scan.nextInt();
			min = Math.min(min,a[x]+b[y]-c);
		}
		System.out.println(min);

	}

}
