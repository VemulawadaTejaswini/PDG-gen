import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		List<Long> list = new ArrayList<>();

		long temp = 0;
		long val = 0;

		for (long l = 0; l < n-1; l++) {
			val = sc.nextLong();
			list.add(0l);
			temp = list.get((int) val-1)+1;
			list.set((int) val-1, temp);
		}

		for(long l:list) {
			System.out.println(l);
		}

	}


}
