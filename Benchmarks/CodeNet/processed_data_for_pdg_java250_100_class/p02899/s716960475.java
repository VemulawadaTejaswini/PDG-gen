public class Main {
	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = 0;
		}
		int cnt=1;
		fool : for(int i = 0;i<n;i++) {
			b[a[i]-1] = i+1;
		}
		for(int i:b)
			System.out.println(i);
		sc.close();
	}
}
