public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String move = sc.nextLine();
		String[] moveLine = new String[100];
		moveLine = move.split("");
		boolean isFumiyasusa = false;
		String ans = "";
		for (int i = 1; i-1 < moveLine.length; i++) {
			if ((i) % 2 == 0) {
				if (moveLine[i-1].equals("L") || moveLine[i-1].equals("U") || moveLine[i-1].equals("D")) {
					isFumiyasusa = true;
				} else {
					isFumiyasusa = false;
					break;
				}
			} else {
				if (moveLine[i-1].equals("R") || moveLine[i-1].equals("U") || moveLine[i-1].equals("D")) {
					isFumiyasusa = true;
				} else {
					isFumiyasusa = false;
					break;
				}
			}
		}
		if (isFumiyasusa) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
		sc.close();
	}
}
