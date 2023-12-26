public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String InStr = scan.nextLine();
		String[] AryStr = InStr.split(" ");
		int A;
		int B;
		A = Integer.parseInt(AryStr[0]);
		B = Integer.parseInt(AryStr[1]);
		if (A < B) {
			A = B--;
        } else if (A > B) {
            B = A--;
        }
        System.out.println(A + B);
	}
}
