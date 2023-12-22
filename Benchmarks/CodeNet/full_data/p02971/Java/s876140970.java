import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> A = new ArrayList<>();

		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}

		for(int i=0;i<N;i++) {
			List<Integer> temp = new ArrayList<>(A);
			temp.remove(i);
			System.out.println(Collections.max(temp));
		}
	}

}
