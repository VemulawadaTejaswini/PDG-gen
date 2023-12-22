import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int N  = scan.nextInt();
	        int[] H = new int[N];
	        for(int i=0;i<N;i++) {
	        	H[i] = scan.nextInt();
	        }


	        for(int i=0;i<H.length-1;i++) {
	        	if(nextAnoNum(H, i) == -1) {
	        		H[i]--;
	        	}

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
	public static int nextAnoNum(int[] x,int index) {
		for(int i= index+1;i<x.length;i++) {
			if(x[i] == x[index]) {
				continue;
			}
			return  x[i] - x[index];
		}
		return 0;
	}
}

