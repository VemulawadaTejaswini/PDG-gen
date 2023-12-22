import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N  = scan.nextInt();
	        int[] H = new int[N];
	        boolean f=false;
	        for(int i=0;i<N;i++) {
	        	H[i] = scan.nextInt();
	        }

	        for(int i=0;i<H.length-1;i++) {
	        	if(H[i] <= H[i+1]) {
	        		continue;
	        	}
	        	H[i]--;
	        	if(H[i] <= H[i+1]) {
	        		continue;
	        	}
	        		System.out.println("No");
		        	return;
	        }
	        for(int i=0;i<H.length-1;i++) {
	        	if(H[i] <= H[i+1]) {
	        		continue;
	        	}
	        	System.out.println("No");
	        	return;
	        }

	        System.out.println("Yes");


	       	scan.close();

	}
}
