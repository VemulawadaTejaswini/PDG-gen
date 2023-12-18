public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tate = scan.nextInt();
		int yoko = scan.nextInt();
		int menseki = tate * yoko;
		int syu = 2*tate + 2*yoko;
		System.out.println(menseki + " " +syu);
	}
}
