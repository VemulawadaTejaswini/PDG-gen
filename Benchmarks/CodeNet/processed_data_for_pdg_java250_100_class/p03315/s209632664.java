public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.next();
		int ans = 0;
		for(int i = 0; i < 4; i++) {
			if(s.charAt(i) == '+') {
				ans++;
			}
			else {
				ans--;
			}
		}
		System.out.println(ans);
		sc1.close();
	}
}
