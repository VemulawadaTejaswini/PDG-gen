import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		
		int[] t = new int[n];
		for(int i = 0; i < n; i++){
			t[i] = scn.nextInt();
		}
		int sum = 0;
		int y = 0;
		
		int m = scn.nextInt();
		for(int i = 0; i < m; i++){
			int x = scn.nextInt();
			y = t[x-1];
			t[x-1] = scn.nextInt();
			for(int j = 0; j < n; j++){
				sum += t[j];
			}
			System.out.println(sum);
			sum = 0;
			t[x-1] = y;
		}
	}
}