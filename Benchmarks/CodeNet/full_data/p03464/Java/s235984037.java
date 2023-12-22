import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long[] ks = new long[k];
		for (int i = 0; i < k; i++) {
			ks[i] = Long.parseLong(sc.next());
		}
		long min = 2;
		long max = 3;
		for(int i = k - 2; i >= 0; i--) {
			//min
			if(ks[i] >= min&&ks[i] < 2L*min) {
				min = ks[i];
			} else if(ks[i] < min) {
				for(long j = 2L; j <= min; j++) {
					if(ks[i]*j >= min) {
						min = ks[i]*j;
						break;
					}
				}
			} else {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(min+" "+(min+ks[0]-1));
	}
}
