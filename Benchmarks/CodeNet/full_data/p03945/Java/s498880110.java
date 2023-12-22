import java.util.Scanner;

public class ICPC_8_P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String game = sc.nextLine();
		int reqMoves = 0;
		if (game.length() > 1) {
			for (int i = 0; i < game.length() - 1; i++) {
				if (game.charAt(i) != game.charAt(i + 1)) {
					reqMoves++;
				}
			}
		}
		System.out.println(reqMoves);
	}
}
