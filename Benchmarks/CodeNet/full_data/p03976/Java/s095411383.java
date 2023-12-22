import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] initial = new int[26];
		int cnt = 0;

		for(int i=0; i<n; i++){
			String s = sc.next();
			initial[s.charAt(0)-'A']++;
		}

		while(true){
			Arrays.sort(initial);
			int sum = 0;
			for(int i=25; i>=0; i--){
				if(initial[i]>0){
					initial[i]--;
					sum++;
				}
				if(sum==k){
					cnt++;
					break;
				}
			}
			if(sum<k) break;
		}

		System.out.println(cnt);
	}
}