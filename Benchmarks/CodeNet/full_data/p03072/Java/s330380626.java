import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = 0;
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = N; i > 0; i-- ){
			
			int H = scanner.nextInt();
			list.add(H);
			if (H >= max) {
				max = H;
				answer = answer + 1;
			}
		}
		//System.out.println(list);
		System.out.println(answer);
	}
}