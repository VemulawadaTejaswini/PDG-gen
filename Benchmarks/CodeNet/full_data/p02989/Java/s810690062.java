import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int array[] = null;
		int temp = 0;

		Scanner scanner = new Scanner(System.in);

		//入力値を扱いやすいように配列化
		for(int i = 0; scanner.hasNext(); i++) {
			if(i == 0) {
				temp = Integer.parseInt(scanner.next());
				array = new int[temp];
			}

			array[i] = Integer.parseInt(scanner.next());
		}
		
		Arrays.sort(array);
		
		System.out.println((array[((temp / 2) -1)] - array[(temp / 2)]) + 1);
	}

}