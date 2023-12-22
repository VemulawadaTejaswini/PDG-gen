import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void ain(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int lookAble = 1;
		String str = sc.next();
		List<Integer> array = new ArrayList<Integer>();

		for(int i = 0;i < num; i++) {
			array.add(Integer.valueOf(str.charAt(i)));
		}

		int max = 0;
		for(int j = 0; j < num ;j++) {
			if((int)array.get(j) > max);
				lookAble += 1;
		}

		System.out.println(lookAble);
	}
}