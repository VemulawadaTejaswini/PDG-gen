import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		City[] cities = new City[n];
		for (int i = 0; i < n; i++) {
			cities[i] = new City(i, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			return c1.x - c2.x;
        }
		});
		Road[] roads = new Road[(n - 1) * 2];
		for (int i = 0; i < n - 1; i++) {
			roads[i] = new Road(cities[i].id, cities[i + 1].id, cities[i + 1].x - cities[i].x);
		}
		Arrays.sort(cities, new Comparator<City>() {
		public int compare(City c1, City c2) {
			return c1.y - c2.y;
        }
		});
		for (int i = 0; i < n - 1; i++) {
			roads[n - 1 + i] = new Road(cities[i].id, cities[i + 1].id, cities[i + 1].y - cities[i].y);
		}
		Arrays.sort(roads, new Comparator<Road>() {
		public int compare(Road r1, Road r2) {
			return r1.cost - r2.cost;
        }
		});
		ArrayList<boolean[]> list = new ArrayList<boolean[]>();
		long sum = 0;
		for (Road r : roads) {
			boolean flag = false;
			boolean[] merged = null;
			boolean[] merge = null;
			for (boolean[] visited : list) {
				if (visited[r.src] && visited[r.dst]) {
					flag = true;
					break;
				}
				if (!flag & visited[r.src] && !visited[r.dst]) {
					flag = true;
					visited[r.dst] = true;
					sum += r.cost;
					merged = visited;
				} else if (!flag & !visited[r.src] && visited[r.dst]) {
					flag = true;
					visited[r.src] = true;
					sum += r.cost;
					merged = visited;
				} else if (flag) {
					if (visited[r.src] || visited[r.dst]) {
						merge = visited;
						break;
					}
				}
			}
			if (flag) {
				if (merged != null && merge != null) {
					mergeVisit(merged, merge);
					list.remove(merge);
				}
			} else {
				boolean[] visited = new boolean[n];
				visited[r.src] = true;
				visited[r.dst] = true;
				list.add(visited);
				sum += r.cost;
			}
		}
		System.out.println(sum);
	}
	
	static void mergeVisit(boolean[] merged, boolean[] merge) {
		for (int i = 0; i < merged.length; i++) {
			merged[i] = merged[i] || merge[i];
		}
	}
	
	static class City {
		int id;
		int x;
		int y;
		
		public City(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}
	}
	
	static class Road {
		int src;
		int dst;
		int cost;
		
		public Road(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}
	}
}
