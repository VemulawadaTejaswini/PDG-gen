import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> ans = new ArrayList<>();

		if (n==0){
			ans.add(0);
		}
		while (n != 0){
			int b = Math.abs(n%2);
			ans.add(b);
			n = (n-b)/-2;
		}
		Collections.reverse(ans);

		for (int degit : ans){
			System.out.print(degit);
		}
		System.out.println();
	}
}