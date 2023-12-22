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
			list.add(new String(c));
		}

		for (int i = 0; i < list.size(); i++) {
			for(int t = i + 1;t < list.size();t++) {
				if(list.get(i).equals(list.get(t))) {
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}
