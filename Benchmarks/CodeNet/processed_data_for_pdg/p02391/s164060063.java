public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		String hikaku;
		if(a < b) {
			hikaku = "<";
		} else if(a > b) {
			hikaku = ">";
		} else {
			hikaku = "==";
		}
		System.out.println("a " + hikaku + " b");
	}
}
