public class Main {
	public static void main(String[] args) {
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean f = false;
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
			count += a[i];
		}
		System.err.println(count);
		for(int i = 0; i < n ; i++) {
			double tmp = (double) count / (4*m);
			System.err.println(a[i]+" "+tmp);
			if(a[i] < tmp) {
			} else {
				ans++;
				if(ans >= m) {
					f = true;
					break;
				}
			}
		}
		if(f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
