public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output_s = new StringBuilder();
		StringBuilder output_h = new StringBuilder();
		StringBuilder output_c = new StringBuilder();
		StringBuilder output_d = new StringBuilder();
		int[] spades = new int[13];
		int[] hearts = new int[13];
		int[] clubs = new int[13];
		int[] diamonds = new int[13];
		for (int i = 0; i < 13; i++) {
			spades[i] = i + 1;
			hearts[i] = i + 1;
			clubs[i] = i + 1;
			diamonds[i] = i + 1;
		}
		int amount = scan.nextInt();
		String mark;
		int number;
		for (int j = 0; j < amount; j++) {
			mark = scan.next();
			number = scan.nextInt();
			if ("S".equals(mark)) {
				spades[number - 1] = 0;
			}
			if ("H".equals(mark)) {
				hearts[number - 1] = 0;
			}
			if ("C".equals(mark)) {
				clubs[number - 1] = 0;
			}
			if ("D".equals(mark)) {
				diamonds[number - 1] = 0;
			}
		}
		for (int i = 0; i < 13; i++) {
			if (spades[i] != 0) {
				output_s.append("S" + " " + (i + 1)).append('\n');
			}
			if (hearts[i] != 0) {
				output_h.append("H" + " " + (i + 1)).append('\n');
			}
			if (clubs[i] != 0) {
				output_c.append("C" + " " + (i + 1)).append('\n');
			}
			if (diamonds[i] != 0) {
				output_d.append("D" + " " + (i + 1)).append('\n');
			}
		}
		System.out.print(output_s);
		System.out.print(output_h);
		System.out.print(output_c);
		System.out.print(output_d);
	}
}
