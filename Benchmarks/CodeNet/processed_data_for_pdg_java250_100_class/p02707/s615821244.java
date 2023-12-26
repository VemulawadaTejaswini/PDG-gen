public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean f = false;
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] ans = new int[n];
		for (int i = 0; i < n-1; i++) {
			a[i]= sc.nextInt();
			ans[i] = 0;
		}
		ans[n-1] = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] != 0)
				ans[a[i]-1]++;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
