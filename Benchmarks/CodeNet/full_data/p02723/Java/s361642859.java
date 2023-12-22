public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();

		if ((A.substring(4, 5)).equals(A.substring(5, 6))) {
			if ((A.substring(A.length()-2,A.length()-1)).equals(A.substring(A.length()-1))) {
				System.out.print("Yes");
			}
		} else {
			System.out.print("No");
		}

	}

}
