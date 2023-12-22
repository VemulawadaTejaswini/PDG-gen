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
	        	nextAnoNum(H, i);

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
	public static void nextAnoNum(int[] x,int index) {
		int sa = 0;
		for(int i= index+1;i<x.length;i++) {
			if(x[i] == x[index]) {
				continue;
			}
			sa = x[i] - x[index];
			break;
		}
		if(sa == -1) {
			int ori = x[index];
			for(int i= index;i<x.length;i++) {
				if(x[i] == ori) {
					x[i]--;
				}
			}
		}
		return;
	}
}