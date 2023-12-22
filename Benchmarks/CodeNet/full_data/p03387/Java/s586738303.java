import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		ArrayList<Integer> array_number = new ArrayList<>();


		//入力
		int first_input = sc.nextInt();
		array_number.add(first_input);

		int second_input = sc.nextInt();
		array_number.add( second_input);

		int third_input = sc.nextInt();
		array_number.add(third_input);

		//入力された文字を昇順に並べる
		Collections.sort(array_number);

		int a = array_number.get(0);
		int b = array_number.get(1);
		int c = array_number.get(2);

		while (a+2 <= c) {
			a = a + 2;
			count ++;
		}

		while (b+2 <= c) {
			b = b + 2;
			count ++;
		}


		if (a + 1== c && b + 1 == c) {
			count ++;
		}

		else if (a + 1 == c || b + 1 == c){
			count = count + 2;
		}

		else {
			count = count + 0;
		}

		System.out.println(count);

	}
}