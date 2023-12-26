public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.nextLine();
			if (input.equals("0"))
				break;
			char[] sentence = input.toCharArray();
			int sum = 0;
			for (int cnt = 0; cnt < sentence.length; cnt++) {
				sum += Character.getNumericValue(sentence[cnt]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
