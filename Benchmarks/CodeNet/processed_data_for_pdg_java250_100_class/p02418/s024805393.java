public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		String p = "";
		String searched_line = "";
		boolean judge = false;
		int count = 0; 
		s = sc.nextLine();
		p = sc.nextLine();
		if (p.length() >= 1 && s.length() >= p.length() && s.length() <= 100) {
			searched_line = s + s.substring(0, p.length() - 1);
			out: for (int i = 0; i < s.length(); i++) {
				count = 0;
				if (("" + searched_line.charAt(i)).equals("" + p.charAt(0))) { 
					count++;
					in: for (int j = 1; j < p.length(); j++) {
						if (("" + searched_line.charAt(i + j)).equals("" 
								+ p.charAt(j)) == false) {
							break in;
						}
						count++;
					}
					if (count == p.length()) { 
						judge = true;
						break out;
					}
				} 
			}
			if (judge == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
