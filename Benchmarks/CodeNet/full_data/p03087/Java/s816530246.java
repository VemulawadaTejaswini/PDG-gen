import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < s.length()-1; i++) 
			if(s.substring(i, i+2).equals("AC"))
				list.add(i);
		long[] results = new long[q];
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt() -1;
			int r = sc.nextInt()-1;
			results[i] = list.stream()
					.filter(pos -> l <= pos && pos < r)
					.count();
		}
		for(int i = 0; i < results.length; i++)
			System.out.println(results[i]);
	}
}