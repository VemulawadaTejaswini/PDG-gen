public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if((c == 'U') || (c == 'D')) {
				continue;
			}
			if(i%2 == 0) {
				if(c != 'R') {
					System.out.println("No");
					return;
				}
			}else if(i%2 == 1) {
				if(c != 'L') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
