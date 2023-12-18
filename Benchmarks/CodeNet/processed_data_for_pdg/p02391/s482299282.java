public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String temp = "";
		if(a>b) {
			temp = ">";
		}else if (a<b) {
			temp = "<";
		}else {
			temp = "==";
		}
		System.out.println("a " + temp + " b");
		scanner.close();
	}
}
