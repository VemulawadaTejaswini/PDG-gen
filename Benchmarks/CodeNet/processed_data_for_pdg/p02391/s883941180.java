public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans;
		if (a < b){
			ans = "a < b";
		} else if (a > b){
			ans = "a > b";
		} else {
			ans = "a == b";
		}
		System.out.println(ans);
	}
}
