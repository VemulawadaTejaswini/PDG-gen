
import java.util.Scanner;


public class Main {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] begin = new int[n];
		int[] end = new int[n];
		for (int i=0;i<n;i++) {
			begin[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			end[i]=sc.nextInt();
		}
		
		int count = 0;
		boolean change = true;
		while (change) {
			change = false;
			for (int i=0;i<n;i++) {
				int left = (i==0 ? end[n-1] : end[i-1]);
				int right = (i==n-1 ? end[0] : end[i+1]);

				if (end[i]>left+right && end[i]>begin[i]) {
					end[i]-=(left+right);
					count++;
					change = true;
				}
			}
		}
		
		boolean same = true;
		for (int i=0;i<n;i++) {
			if (begin[i]!=end[i]) {
				same=false;
				break;
			}
		}
		if (same) {
			System.out.println(count);
		} else {
			System.out.println(-1);
		}
	}
}