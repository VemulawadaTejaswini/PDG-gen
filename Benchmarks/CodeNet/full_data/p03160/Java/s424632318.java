import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> hArrayList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			hArrayList.add(Integer.parseInt(sc.next()));
		}

		ArrayList<Integer> dp = new ArrayList<>();

		dp.add(0);
		dp.add(Math.abs(hArrayList.get(0) - hArrayList.get(1)));

		for (int i=2; i<n; i++){
			dp.add(Math.min(Math.abs(hArrayList.get(i) - hArrayList.get(i-1)) + dp.get(i-1), Math.abs(hArrayList.get(i) - hArrayList.get(i-2)) + dp.get(i-2)));
		}
		System.out.println(dp.get(n-1));
	}
}
