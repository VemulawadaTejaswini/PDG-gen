public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = a[0] - 1;
		a[3] = a[1] - 1;
		Arrays.sort(a);
		System.out.println(a[3] + a[2]);
	}
}
