import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] j = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++){
			int l = scan.nextInt();
			j[l]++;
			max = Math.max(max, l);
		}

		int ans =0;

		for(int k = 0; k < max; k++){
			if(j[k] == 0) continue;
			if(j[k] > k){
				ans += j[k] - k;
			}
		}
		System.out.println(ans);
	}
}