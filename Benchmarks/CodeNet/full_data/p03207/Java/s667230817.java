import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> p = new ArrayList<Integer>();

		int sum = 0;
		for(int i=0; i<N;i++){
			int tmp = Integer.parseInt(sc.next());
			sum += tmp;
			p.add(tmp);
		}
		Collections.sort(p);
		int max = p.get(p.size()-1);
		System.out.println(sum - max / 2);
	}
}