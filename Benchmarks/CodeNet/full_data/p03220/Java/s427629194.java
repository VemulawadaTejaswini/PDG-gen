import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in) ;
			ArrayList<Integer> ar = new ArrayList<Integer>();
			
			int n = sc.nextInt();
			int t  = sc.nextInt();
			int a = sc.nextInt();
			int h[] = new int[n];
			
			for(int i=0;i<n;i++) {
				h[i] = sc.nextInt();
			}
			
			double[] sa = new double[n];
			
			for(int i=0;i<n;i++) {
				sa[i]=Math.abs(t-h[i]*0.006-a);
			}
			
			int kotae = 1;
			double hikaku = sa[0] ;
			
			for(int j=0;j<n;j++) {
				if(hikaku>sa[j]) {
					hikaku = sa[j];
					kotae=j+1;
				}
				
				System.out.println(kotae);
			
			}
		}
}
