import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] roads = new int[n];
		Arrays.fill(roads, 0);
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			roads[a-1] ++;
			roads[b-1] ++;
		}
		for(int i=0;i<n;i++) System.out.println(roads[i]);
	}

}