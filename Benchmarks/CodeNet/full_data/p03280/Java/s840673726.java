import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 入力
		int Ayard = Integer.max(0, sc.nextInt()-1);
		int Byard = Integer.max(0, sc.nextInt()-1);

		// 面積の出力
		System.out.println(Ayard * Byard);
		sc.close();
	}

}
