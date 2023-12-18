public class Main {
	public static void main(String[] args) {
		int Max = 10000;
		int[] x = new int[Max];
		int n = 0; 
		Scanner sc = new Scanner(System.in);
		int input = 100;
		boolean inputjudge = true; 
		for (int i = 0; i < x.length; i++) {
			input = sc.nextInt();
			if (input >= 1 && input <= 10000) {
				x[i] = input;
				n++;
			} else if (input == 0) {
				break;
			} else { 
				inputjudge = false;
				break;
			}
		}
		if (inputjudge == true) {
			for (int i = 0; i < n; i++) {
				System.out.println("Case " + (i + 1) + ": " + x[i]);
			}
		}
	}
}
