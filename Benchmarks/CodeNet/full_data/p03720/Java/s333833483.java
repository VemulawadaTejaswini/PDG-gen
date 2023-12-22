import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>() {
			{
				for (int i = 0; i < n; i++) {
					add(new ArrayList<>());
				}
			}
		};
		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 0; i < graph.size(); i++) {
			System.out.println(graph.get(i).size());
		}
		in.close();
	}
}