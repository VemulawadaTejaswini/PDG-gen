public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] a = n.toCharArray();
		for (int i = 0; i < 3; i++) {
			if (a[i] == '1') {
				a[i] = '9';
			} else {
				a[i] = '1';
			}
		}
		System.out.println(String.valueOf(a));
	}
}
