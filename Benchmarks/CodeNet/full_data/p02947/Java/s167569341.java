import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int result = 0;

		int number = sc.nextInt();
		sc.nextLine();

		// 文字列を読み込んでアルファベット順にソートして格納
		for (int i = 1; i <= number; i++) {
			char[] c = sc.nextLine().toCharArray();
			Arrays.sort(c);
			if(list.contains(new String(c))) {
				result++;
			}else {
				list.add(new String(c));
			}
		}
		
		System.out.println(result);
	}
}
