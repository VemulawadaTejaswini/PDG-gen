import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stone_num1 = sc.nextInt();
		int stone_num2 = sc.nextInt();

		int turn = 1;


		while(stone_num1 >= 2 || stone_num2 >= 2){

			if(stone_num2 > stone_num1){
				int temp = stone_num1;
				stone_num1 = stone_num2;
				stone_num2 = temp;
			}

			stone_num1 -= 2;
			stone_num2 += 1;

			turn *= -1;
		}

		String win = turn == 1 ? "Brown" : "Alice";
		System.out.println(win);

		sc.close();
	}

}
