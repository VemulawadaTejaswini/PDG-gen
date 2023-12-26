public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String UpperAlpha = "abcdefghijklmnopqrstuvwxyz";
		String W;
		String line;
		String[] T;
		int count_Empty = 0;
		boolean judge_W = true;
		boolean judge_T = true;
		int count_W = 0;
		W = sc.nextLine();
		if (W.length() > 10) {
			judge_W = false;
		}
		if (judge_W == true) {
			out: for (int i = 0; i < W.length(); i++) {
				if (UpperAlpha.indexOf("" + W.charAt(i)) == -1) {
					judge_W = false;
					break out;
				}
			}
		}
		if (judge_W == true) {
			out: while (true) {
				line = sc.nextLine(); 
				if (line.equals("END_OF_TEXT")) { 
					break out; 
				}
				T = (line.toLowerCase()).split(" ");
				count_Empty += T.length - 1; 
				if (line.length() - count_Empty > 1000) {
					judge_T = false;
					break out;
				}
				for (int j = 0; j < T.length; j++) {
					if (T[j].equals(W)) {
						count_W++;
					}
				}
			}
			if (judge_T == true) {
				System.out.println(count_W);
			}
		}
	}
}
