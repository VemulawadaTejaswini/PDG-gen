import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int min= Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(p[i] < min) {
				count++;
				min = p[i];
			}
		}
		System.out.println(count);
	}
}
