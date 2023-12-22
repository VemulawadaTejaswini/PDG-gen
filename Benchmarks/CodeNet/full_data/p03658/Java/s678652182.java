import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		ArrayList<Integer> lArrayList = new ArrayList<>();

		for(int i=0; i<n; i++){
			lArrayList.add(Integer.parseInt(sc.next()));
		}

		Collections.sort(lArrayList);

		System.out.println((int)lArrayList.stream()
				.skip(lArrayList.size()-k)
			    .mapToDouble(a -> a)
			    .sum());
	}
}