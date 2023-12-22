import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		   int n = sc.nextInt();
		   double[] h = new double[n];
		   int flg = 0;
		   for(int i=0;i<n;i++) {
			   h[i] = sc.nextDouble();
		   }
		   for(int i=0;i<n-1;i++) {
			   if(h[i]-h[i+1]==1) {
				   if(flg == 2) {
					   flg = 1;
					   break;
				   }else {
					   flg = 2;
				   }
			   }else if(h[i]-h[i+1]==0) {
				   flg = 2;
			   }else if(h[i]-h[i+1]>=2) {
				   flg = 1;
				   break;
			   }else {
				   flg = 0;
			   }
		   }
		   if(flg == 1) {
			   System.out.println("No");
		   }else {
			   System.out.println("Yes");
		   }

		    sc.close();
	}
}
