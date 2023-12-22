public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String ans;

		if (a == c) {
			ans = "Yes";
		} else if (a < c){
			if (c-a <= d){
				ans = "Yes";
			} else if (a <= b && b <= c){
				if (c-b <= d && b-a <=d){
					ans = "Yes";
				} else {
					ans = "No";
				}
			} else {
				ans = "No";
			}
		} else if (c < a) {
			if (a-c <= d){
				ans = "Yes";
			} else if (c <= b && b <= a){
				if (a-b <= d && b-c <=d){
					ans = "Yes";
				} else {
					ans = "No";
				}
			} else {
				ans = "No";
			}
		} else {
			ans = "No";
		}
		// 出力
		System.out.println(ans);
	}
}