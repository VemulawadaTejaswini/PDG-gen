import java.util.*;	

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		int conbination;
		double sum = 0;
		double coord[][] = new double[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				coord[i][j] = sc.nextDouble();
			}
		}
		for(int i = 1; i <= n; i++) {
			fact *= i; 
		}
		conbination = n * (n - 1) / 2;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
			sum += (fact * (n - 1) / conbination) * Math.sqrt(Math.pow(coord[i][0] - coord[j][0], 2) + Math.pow(coord[i][1] - coord[j][1], 2));
		    }
		}
		System.out.println(sum / fact);
	}
}