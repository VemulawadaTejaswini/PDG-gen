
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int K = Integer.parseInt(scan.next());
		long count = 0;
		if (K % 2 == 1) {
			for (int i = 1; i <= N; i++) {
				if (i % K == 0) {
					count++;
				}
			}
			count=count*count*count;
		} else {
			long count1 = 0;
			long count2 = 0;
			for (int i = 1; i <= N; i++) {
				if (i % K == 0) {
					count1++;
				} else if (i % K == (K / 2)) {
					count2++;
				}
			}
			count = count1*count1*count1 + count2*count2*count2;
		}
		System.out.println(count);
	}
}
