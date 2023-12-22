public class Main {

	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).nextLine();
		boolean bool = true;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if((i + 1) % 2 == 1 && c == 'L') {
				bool = false;
				break;
			}
			if((i + 1) % 2 == 0 && c == 'R') {
				bool = false;
				break;
			}
		}

		if(bool == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}