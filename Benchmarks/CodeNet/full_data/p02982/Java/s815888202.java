
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] x = new int[n][d];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(isInteger(getDistance(x[i], x[j]))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static boolean isInteger(double d) {
		int f = (int)Math.floor(d);
		if(d-f > 0)return false;
		else return true;
	}
	
	static double getDistance(int[] x1, int[] x2) {
		double d = 0;
		for (int i = 0; i < x1.length; i++) {
			d += Math.pow(x1[i]-x2[i], 2);
		}
		return Math.sqrt(d);
	}

}
