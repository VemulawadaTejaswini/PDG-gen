import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] counts = new int[m];
		for(int i = 0; i < n; i++){
			int k = sc.nextInt();
			for(int i2 = 0; i2 < k; i2++){
				int a = sc.nextInt();
				counts[a - 1]++;
			}
		}
		int count = 0;
		for(int i = 0; i < m; i++){
			if(counts[i] == n){
				count++;
			}
		}
		System.out.println(count);
	}
}
