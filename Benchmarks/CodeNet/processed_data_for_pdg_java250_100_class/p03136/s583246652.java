public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			l[i] = sc.nextInt();
			sum += l[i];
		}
		Arrays.sort(l);
		System.out.println(l[n - 1] < sum - l[n - 1] ? "Yes" : "No");
	}
}
