public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] S = new String[3];
		int sum = 700;
		int add = 0;
		for (int i = 0; i < 3; i++) {
			S[i] = scan.next();
			if (S[i].equals("o")) {
				add += 100;
			}
		}
		System.out.print(sum + add);
	}

}
