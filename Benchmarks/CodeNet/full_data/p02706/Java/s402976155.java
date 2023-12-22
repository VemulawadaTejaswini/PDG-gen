import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();
		Integer sum = 0;
		int x = 0;
		
		while(sc.hasNext()) {
			Integer a = sc.nextInt();
			sum += a;
			array.add(a);
		}

		if(sum > n) {
			System.out.println(-1);
		} else {
			System.out.println(n - sum);
		}

		sc.close();

	}

}