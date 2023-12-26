public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shuffled_card = ""; 
		int m = 0; 
		int h = 0; 
		int MAX_DATA = 10;
		int NUMBER_OF_DATA = 0;
		String n = ""; 
		boolean judge_m = true; 
		boolean judge_n = true; 
		String[] output = new String[MAX_DATA];
		out: for (int i = 0; i < MAX_DATA; i++) {
			n = sc.next();
			shuffled_card = n;
			if (n.equals("-")) {
				break out;
			}
			NUMBER_OF_DATA++;
			if (n.length() < 1 || n.length() > 200) {
				judge_n = false;
				break out;
			}
			m = sc.nextInt();
			if (m < 1 && m > 100) {
				judge_m = false;
				break out;
			}
			for (int j = 0; j < m; j++) {
				h = sc.nextInt();
				shuffled_card = shuffled_card.substring(h,
						shuffled_card.length())
						+ shuffled_card.substring(0, h);
			}
			output[i] = shuffled_card;
		}
		if (judge_m == true && judge_n == true) {
			for (int k = 0; k < NUMBER_OF_DATA; k++) {
				System.out.println(output[k]);
			}
		}
	}
}
