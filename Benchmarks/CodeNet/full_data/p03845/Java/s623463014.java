import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t[]= new int[n];
		int all=0;
		for(int i=0;i<n;i++) {
			t[i]=scan.nextInt();
			all+=t[i];
		}
		int m= scan.nextInt();
		int p[]= new int[m];
		int x[]= new int[m];
		for(int i=0;i<m;i++) {
			p[i]=scan.nextInt();
			x[i]=scan.nextInt();
		}
		scan.close();

		for(int i=0;i<m;i++) {
			int sum=all;
			for(int j=0;j<n;j++) {
				if( p[i]-1==j ) {
					if(x[i] < t[j]) {
						sum -= x[i];
					}else {
						sum += -t[ p[i]-1 ] + x[i] ;
					}
					System.out.println(sum);
					break;
				}
			}
		}
	}
}