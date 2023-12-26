public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'B') {
				res += s.charAt(i);
			}
			else {
				res = res.substring(0, Math.max(res.length() - 1, 0));
			}
		}
		System.out.println(res);
	}
}
