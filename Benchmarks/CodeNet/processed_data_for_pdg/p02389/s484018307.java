public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int intAns = 0;
		int intAns1 = 0;
			int intTate = sc.nextInt();
			int intYoko = sc.nextInt();
			intAns = intTate * intYoko;
			intAns1 = 2 * intTate + 2 * intYoko;
			System.out.println(intAns+ " " +intAns1);
	}
}
