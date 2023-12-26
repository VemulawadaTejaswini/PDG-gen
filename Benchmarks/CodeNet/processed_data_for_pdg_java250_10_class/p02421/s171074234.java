public class Main{
	public static void main(String[] args) {
		String Alpha = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String line1 = "";
		String line2 = "";
		int T_Score = 0; 
		int H_Score = 0; 
		int win = 3; 
		int draw = 1; 
		String[] animal = new String[2]; 
		int T_Value = 0; 
		int H_Value = 0; 
		int n = 0; 
		int compare_length = 0;
		boolean judge_n = true;
		boolean judge_line = true;
		line1 = sc.nextLine();
		n = Integer.parseInt(line1);
		if (n < 0 || n > 1000) {
			judge_n = false;
		}
		if (judge_n == true) {
			out: for (int i = 0; i < n; i++) {
				line2 = sc.nextLine();
				if (line2.length() > 100) {
					judge_line = false;
					break out;
				}
				animal = line2.split(" ");
				if (animal[0].length() > animal[1].length()) {
					compare_length = animal[1].length();
				} else if (animal[1].length() > animal[0].length()) {
					compare_length = animal[0].length();
				} else {
					compare_length = animal[0].length(); 
				}
				in: for (int k = 0; k < compare_length; k++) {
					T_Value = Alpha.indexOf("" + animal[0].charAt(k));
					H_Value = Alpha.indexOf("" + animal[1].charAt(k));
					if (T_Value == -1 || H_Value == -1) {
						judge_line = false; 
						break out;
					}
					if (T_Value != H_Value) {
						if (T_Value > H_Value) {
							T_Score += win;
						} else {
							H_Score += win;
						}
						break in;
					} else {
						if (k == compare_length - 1) { 
							if (animal[0].length() == animal[1].length()) {
								T_Score += draw;
								H_Score += draw;
							} else if (animal[0].length() > animal[1].length()) {
								T_Score += win;
							} else {
								H_Score += win;
							}
						}
					}
				}
			}
			if (judge_line == true) {
				System.out.println(T_Score + " " + H_Score);
			}
		}
	}
}
