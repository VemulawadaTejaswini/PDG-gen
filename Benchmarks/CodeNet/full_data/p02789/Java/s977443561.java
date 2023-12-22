public class AC_or_WA {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[0]);
		if (n >=1 || n<= 100) {
			if (m >= 0 || m <= n) {
				if (m== n) {
					System.out.println("yes");
				}
			}
		}
		else {
			System.out.println("no");
		}
	}

}