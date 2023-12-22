import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n + 1];
		int[] com = new int[n + 1];
		int[] subcom = new int[n + 1];

		int i;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			sum[a[i]]++;
		}
		for(i = 0; i < n + 1; i++) {
			if(sum[i] == 0 || sum[i] == 1)
				continue;
			subcom[i] = ((sum[i] - 2) * (sum[i] - 1)) / 2;
		}

		long total = 0;
		for(i = 0; i < n + 1; i++) {
			if(sum[i] == 0 || sum[i] == 1)
				continue;
			com[i] = ((sum[i] - 1) * sum[i]) / 2;
			total += com[i];
		}

		for(i = 0; i < n; i++) {
			System.out.println(total - com[a[i]] + subcom[a[i]]);
		}
	}
}