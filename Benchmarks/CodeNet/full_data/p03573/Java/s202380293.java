import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String symbols = scanner.nextLine();
		String[] arr_split = symbols.split(" ",0);
		scanner.close();
		String let = arr_split[0];
		if (let.equals(arr_split[1])) {
			System.out.println(Integer.parseInt(arr_split[2]));
		} else {
			if (let.equals(arr_split[2])) {
				System.out.println(Integer.parseInt(arr_split[1]));
			} else {
				System.out.println(Integer.parseInt(arr_split[0]));
			}
		}
	}

}
