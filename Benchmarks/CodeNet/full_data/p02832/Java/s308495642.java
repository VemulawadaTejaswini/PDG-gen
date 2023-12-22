import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int search = 1;
			for(int i = 0 ; i < n ; i++) {
				if(sc.nextInt() == search) {
					search++;
				}
			}
			System.out.println(search == 1 ? -1 : n - (search - 1));
		}

	}

}
