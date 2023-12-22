import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] pos = new int[n][2];
		for(int i=0; i<n; i++) {
			pos[i][0] = sc.nextInt();
			pos[i][1] = sc.nextInt();
		}
		double sum = 0;
		int branch = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				sum += calcLength(pos[i], pos[j]);
				branch ++;
			}
		}
		
		System.out.println(sum/branch * (n-1));
		
	}
	
	public static double calcLength(int[] from, int[] to) {
		return Math.sqrt(Math.pow(from[0]-to[0], 2) + Math.pow(from[1]-to[1], 2));
	}

}
