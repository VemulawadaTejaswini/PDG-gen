import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int[] array = { 0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1 };
		if (array[x] == array[y])
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
