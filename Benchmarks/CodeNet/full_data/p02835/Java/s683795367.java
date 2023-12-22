import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<List<Integer>> ptnList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		sc.close();

		int t = a1 + a2 + a3;

		if(t >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}

	}

}
