public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		String ans;

		if (c-a==d || a-c==d){
			ans = "Yes";
		} else if ((c+b)-a==d || a-(c+b)==d){
			ans = "Yes";
		} else {
			ans = "No";
		}

		// 出力
		System.out.println(ans);
	}
}
