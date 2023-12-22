import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int flg = 0;

		while (c > 0) {
		    list.add(c % 10);
		    c /= 10;
		}
		for (int n : list){
			if (n == 7){
				flg = 1;
			}
		}
		if (flg == 1){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
