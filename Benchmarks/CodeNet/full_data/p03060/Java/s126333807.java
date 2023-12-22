import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		StringTokenizer a = new StringTokenizer(sc.nextLine());
		StringTokenizer b = new StringTokenizer(sc.nextLine());
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			int value = Integer.parseInt(a.nextToken()) - Integer.parseInt(b.nextToken());
			sum += value > 0 ? value : 0;
		}
		
		System.out.println(sum);
	}
}
