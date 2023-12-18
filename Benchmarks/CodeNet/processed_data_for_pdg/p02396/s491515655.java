public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String n;
		String a = "Case ";
		String b = ": ";
		for(int i = 1;(n = sc.next()).length() != 1 || n.charAt(0) != '0';i++) {
			sb.append(a);
			sb.append(i);
			sb.append(b);
			sb.append(n);
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
}
