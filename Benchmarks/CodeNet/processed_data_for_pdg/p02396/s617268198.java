public class Main {
	Main() {
	}
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		String a = " ";
		String b = "0";
		ArrayList<String> list = new ArrayList<String>();
		String caseNo = "Case";
		for (int i = 0; i < 10000; i++) {
			a = scanner.next();
			if (b.equals(a)) {
				break;
			} else {
				list.add(a);
			}
		}
		for (int j = 0; j < list.size(); j++) {
			System.out.println ("Case " + (j + 1) + ": "  + list.get(j));
		}
	}
}
