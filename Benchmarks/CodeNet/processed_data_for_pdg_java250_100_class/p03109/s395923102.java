public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if (Integer.parseInt(S.substring(5, 7))>4) {
			System.out.println("TBD");
		} else if (Integer.parseInt(S.substring(5, 7))<4) {
			System.out.println("Heisei");
		} else {
			if (Integer.parseInt(S.substring(8))<=30) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		}
	}
}
