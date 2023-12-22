import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hp = scan.nextInt();
		int attack = scan.nextInt();
		int re = 0;

		do {

			hp -= attack;
			re++;
		}while(hp > 0);

		System.out.println(re);
		scan.close();

	}

}
