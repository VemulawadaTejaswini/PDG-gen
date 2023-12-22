import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		long sum = 0;
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
			sum += d[i];
		}
		sc.close();
		Arrays.sort(d);
		long avg = sum / N;
		int abc = 0, arc = 0, cnt = 0;
		for(int i = 0; i < N; i++) {
			if(avg < d[i]) {
				abc = d[i - 1];
				arc = d[i];
				cnt = i;
				break;
			}
		}
		System.out.println(N / 2 == cnt ? arc - abc : 0);
		// System.out.println("---------------");
		// System.out.println("cnt = " + cnt);
		// System.out.println(arc + " - " + abc + " = " + (arc - abc));
		// System.out.println(avg);
		// System.out.println(Arrays.toString(d));
	}
}	
