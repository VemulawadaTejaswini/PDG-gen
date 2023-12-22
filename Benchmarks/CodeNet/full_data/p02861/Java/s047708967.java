import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] zahyo = new int[n][2];

		for(int i=0;i < n; i++) {
			zahyo[i][0] = sc.nextInt();
			zahyo[i][1] = sc.nextInt();
		}
		double distanceSum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				distanceSum += getDistance(zahyo[i],zahyo[j]);
			}
		}

		System.out.println(distanceSum/n);

	}

	private static double getDistance(int[] i,int[] z) {
		double distance = 0;
		return Math.sqrt(Math.pow(i[0] -z[0],2) + Math.pow(i[1] -z[1],2));
	}
}