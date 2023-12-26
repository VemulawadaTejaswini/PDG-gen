public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String up = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String a = sc.next();
		if(up.indexOf(a) >= 0) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
	}
}
