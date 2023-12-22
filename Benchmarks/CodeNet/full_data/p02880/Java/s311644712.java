import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				list.add(i * j);
			}
		}
		if(list.contains(N)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}