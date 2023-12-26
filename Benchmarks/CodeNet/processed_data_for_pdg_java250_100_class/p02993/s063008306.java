public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] c = str.toCharArray();
		if(c[0] == c[1] || c[1] == c[2] || c[2] == c[3]) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
	}
}
