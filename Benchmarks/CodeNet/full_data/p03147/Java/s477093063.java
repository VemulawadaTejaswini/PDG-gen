import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i ++) {
			h[i] = sc.nextInt();
		}
		int sum = 0;
		int point = 0;
		for(int i = 0;i < n;i ++) {
			if(point < h[i]) {
				sum += h[i] - point;
				point = h[i];
			}else {
				point = h[i];
			}
		}
		System.out.println(sum);
	}
}