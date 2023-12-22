import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		   int n = sc.nextInt();
		   int[] h = new int[n];
		   int flg = 0;
		   for(int i=0;i<n;i++) {
			   h[i] = sc.nextInt();
		   }
		   for(int i=0;i<n-1;i++) {
			   if(h[i]-h[i+1]==1) {
				   if(flg == 2) {
					   flg = 1;
					   break;
				   }else {
					   h[i] -= 1;
					   flg = 2;
				   }
			   }else if(h[i]-h[i+1]>=2) {
				   flg = 1;
				   break;
			   }else {
				   flg = 0;
			   }
		   }
		   if(flg == 0) {
			   System.out.println("Yes");
		   }else {
			   System.out.println("No");
		   }

		    sc.close();
	}
}