import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		HashSet<Integer> paper = new HashSet<>();
		for (int i=0; i<N; i++) {
			int ai = sc.nextInt();
			if(paper.contains(ai)) {
				paper.remove(ai);
			}else {
				paper.add(ai);
			}
		}
		System.out.println(paper.size());
		sc.close();
	}
}