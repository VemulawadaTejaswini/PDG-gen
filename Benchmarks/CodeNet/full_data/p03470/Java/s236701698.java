import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> list = new HashSet<>();		// 整数列

		int num = scan.nextInt();					// 整数の個数
		for(int i = 0; i < num; i++) {
			list.add(scan.nextInt());
		}

		System.out.println(list.size());

		scan.close();

	}

}