public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strW = sc.next();
		String strT;
		int intCounter = 0;
		while (true) {
			 strT = sc.next();
			if (strT.contains("END_OF_TEXT")) {
				break;
			} else if (strW.equalsIgnoreCase(strT)) {
				intCounter++;
			}
		}
		System.out.println(intCounter);
	}
}
