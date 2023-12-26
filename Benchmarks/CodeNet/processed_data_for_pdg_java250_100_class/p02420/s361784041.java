public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String str = "";
		int num, number;
		num = 0;
		char c;
		while (true) {
			sb.append(scan.next());
			if (new String(sb).equals("-")) {
				break;
			}
			num = scan.nextInt();
			for (int count2 = 0; count2 < num; count2++) {
				number = scan.nextInt();
				for (int count3 = 0; count3 < number; count3++) {
					sb.delete(0, 1);
					sb.append(String.valueOf(c));
				}
			}
			sb2.append(new String(sb));
			sb2.append("\n");
			sb.setLength(0);
		}
		sb2.deleteCharAt(sb2.length() - 1);
		System.out.println(new String(sb2));
	}
}
