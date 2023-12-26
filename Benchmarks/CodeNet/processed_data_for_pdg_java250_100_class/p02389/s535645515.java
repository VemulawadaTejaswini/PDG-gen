public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intTate = scan.nextInt();
		int intYoko = scan.nextInt();
		int intArea = intTate * intYoko;
		int intOutLine = (intTate + intYoko) * 2;
		System.out.println(intArea + " " + intOutLine);
	}
}
