import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		CountingRoads solver = new CountingRoads();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class CountingRoads {
		private int n;
		private int m;

		private int a[];
		private int b[];

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		private Scanner scanner;
		private int output[];

		public CountingRoads() {
			scanner = new Scanner(System.in);

		}
		public void readInput() {
			n = scanner.nextInt();
			m = scanner.nextInt();

			for(int i=0; i<n; i++) {
				map.put(i, 0);
			}
		}

		public void solve() {
			int buf;
			for(int i=0; i<m; i++) {
				for(int j=0; j<2; j++) {
					buf = scanner.nextInt();
					map.compute(buf-1, (key,value) -> value+1);
				}
			}
		}
		public void writeOutput() {
			for(Integer key : map.keySet()) {
				System.out.println(map.get(key));
			}
		}
	}
}
