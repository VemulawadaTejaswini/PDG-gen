import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] pos = new int[n];
		for (int i=0; i<n; i++){
			pos[i] = sc.nextInt();
		}
		int[] diff = new int[n];

		diff[0] = Math.abs(pos[0] - x);
		for (int i=1; i<n; i++){
			diff[i] = Math.abs(pos[i] - pos[i-1]);
		}
		Arrays.sort(diff);
		int max = diff[n-1];
		for (int i=max; i>=1; i--){
			if (max % i == 0){
				boolean result = true;
				for (int j=0; j < n-1; j++){
					if (diff[j] % i != 0){
						result = false;
						break;
					}
				}
				if (result){
					System.out.println(i);
					return;
				}
			}
		}
	}
}