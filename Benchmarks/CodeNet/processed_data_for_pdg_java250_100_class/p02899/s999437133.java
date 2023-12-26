public class Main {
	static int intN =0;
	static int sosuCnt =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int intN = Integer.parseInt(n);
		String[] ans = new String[intN];
		String[] a = sc.nextLine().split(" ");
		int sum=0;
		for (int i = 0;i < intN;i++) {
			ans[Integer.parseInt(a[i])-1]=String.valueOf(i+1) + " ";
		}
		String answer = String.join("", ans);
		System.out.println(answer);
	}
}
