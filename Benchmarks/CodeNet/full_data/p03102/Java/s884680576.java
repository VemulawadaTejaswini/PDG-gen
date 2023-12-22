import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		List<Integer> B = new ArrayList<Integer>();

		for (int i=0; i<m; i++){
			B.add(Integer.parseInt(sc.next()));
		}

		int ans = 0;
		for (int j=0; j<n; j++){
			int sum = c;
			for (int k=0; k<m; k++){
				sum += Integer.parseInt(sc.next()) * B.get(k);
			}
			if (sum > 0){
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}
