import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		
		Collections.sort(list);
		
		int ans = list.get(0);
		list.remove(0);
		
		for (int v : list) {
			ans = ans/2 + v/2;
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();

	}

}
