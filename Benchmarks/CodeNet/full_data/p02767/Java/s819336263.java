import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		sc.close();
		int min = Integer.MAX_VALUE;
		for(int p=1;p<=100;p++){
			int wa = 0;
			for(int i=0;i<n;i++){
				wa += (x[i]-p)*(x[i]-p);
			}
			if(min>wa) min = wa;
		}
		System.out.println(min);
	}
}