import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			String [] nm = in.readLine().split(" ");
			final int N = Integer.parseInt(nm[0]);
			final int M = Integer.parseInt(nm[1]);
			City[] cities = new City[M];
			int [] order = new int [N];

			for (int i = 0; i < M; i++) {
				String [] py = in.readLine().split(" ");
				City c = new City(i, Integer.parseInt(py[0]), Integer.parseInt(py[1]));
				cities[i] = c;
			}

			Arrays.sort(cities, new Comparator<City>() {
				@Override
				public int compare(City o1, City o2) {
					// TODO Auto-generated method stub
					return o1.established - o2.established;
				}
			});
			
			for (int i = 0; i < M; i++) {
				cities[i].order = ++order[cities[i].prefId-1];
			}
			Arrays.sort(cities);
			for (int i = 0; i < M; i++) {
				System.out.println(cities[i].cityCode());
			}			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class City implements Comparable<City> {
		private static final String CODE_FORMAT = "%06d%06d";
		int id;
		int prefId;
		int established;
		int order;

		@Override
		public int compareTo(City that) {
			// TODO Auto-generated method stub
			return this.id - that.id;
		}

		public City(int id, int prefId, int established) {
			this.id = id;
			this.prefId = prefId;
			this.established = established;
		}

		public String cityCode() {
			return String.format(CODE_FORMAT, prefId, order);
		}

	}
}
