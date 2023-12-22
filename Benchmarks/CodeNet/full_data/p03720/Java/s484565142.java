import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < m; i++) {
			num[sc.nextInt()-1]++;
			num[sc.nextInt()-1]++;
		}
		for(int i : num) {
			System.out.println(i);
		}
	}
}
