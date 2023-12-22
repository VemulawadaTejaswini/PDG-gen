import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] remList = new int[m];
		Arrays.fill(remList, 0);

		int bef=0;
		for (int i=0; i<n; i++){
			int a = scanner.nextInt();
			int modsum = (bef+a)%m;
			remList[modsum]++;
			bef = modsum;
		}

		int ans = remList[0];
		for (int rem: remList){
			if (rem<=1) continue;
			ans += rem*(rem-1)/2;
		}
		System.out.println(ans);
	}
}