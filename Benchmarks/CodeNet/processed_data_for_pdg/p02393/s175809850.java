public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int[] ans = new int[3];
		ans[0] = sc1.nextInt();
		ans[1] = sc1.nextInt();
		ans[2] = sc1.nextInt();
		Arrays.sort(ans);
		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		sc1.close();
	}
}
