import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int wa = 0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			wa += x[i];
		}
		sc.close();
		// int min = Integer.MAX_VALUE;
		// for(int p=1;p<=100;p++){
		// 	int wa = 0;
		// 	for(int i=0;i<n;i++){
		// 		wa += (x[i]-p)*(x[i]-p);
		// 	}
		// 	if(min>wa) min = wa;
		// }
		int p = 0;
		int min = 0;
		if(wa%n==0) p = wa/n;
		else p = (wa/n)+1;
		for(int i=0;i<n;i++){
			min += (x[i]-p)*(x[i]-p);
		}
		System.out.println(min);
	}
}
