import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] p = new int[n];
		Arrays.setAll(p, i -> sc.nextInt());
		
		int cnt = 0;
		for (int i = 0; i < n - 2; i++) {
			int[] arr = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = p[i + j];
			}
			
			Arrays.sort(arr);
			if (arr[1] == p[i + 1]) cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
}


