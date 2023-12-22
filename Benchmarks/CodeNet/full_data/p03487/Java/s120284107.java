import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] j = new int[n];
		for(int i = 0; i < n; i++){
			j[scan.nextInt()]++;
		}

		int ans =0;

		for(int k = 0; k < n; k++){
			if(j[k] == 0) continue;
			if(j[k] > k){
				ans += j[k] - k;
			}
		}
		System.out.println(ans);
	}

}