public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		int ans=0;
		for (i = 0; i < s.length; i++) {
			switch(s[i]) {
			case '+':
				ans++;
				break;
			case '-':
				ans--;
				break;
			}
		}
		out.println(ans);
	}
}
