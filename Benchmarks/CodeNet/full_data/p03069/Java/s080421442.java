import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		String[] array = S.split("");

		if (array.length == 1) {
			System.out.println(0);
			System.exit(0);
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].equals("#")) {
				if (array[i + 1].equals(".")) {
					array[i + 1] = "#";
					count++;
				}
			}

		}
		
		List list = Arrays.asList(array);
        Collections.reverse(list);
        String[] array2 = (String[])list.toArray(new String[array.length]);
		
        for (int i = 0; i < array2.length - 1; i++) {
			if (array2[i].equals("#")) {
				if (array2[i + 1].equals(".")) {
					array2[i + 1] = "#";
					count++;
				}
			}

		}
		
		
		System.out.println(count);
	}

}