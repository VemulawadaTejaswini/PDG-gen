public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.matches("[A-Z]+")) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		sc.close();
	}
}
