import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			a--;
			graph.get(a).add(i);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(graph.get(i).size());
		}
	}
}
