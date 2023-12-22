import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		City[] city = new City[M];
		Main main = new Main();
		for (int i=0;i<M;i++) {
			City c = main.new City();
			c.ken = sc.nextInt();;
			c.birth = sc.nextInt();
			city[i] = c;
			c.num = i;
		}
		Arrays.sort(city);
		int count =1;
		int befCity = city[0].ken;
		Map <Integer,String> map= new HashMap<Integer,String>(M*2);
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%06d", befCity));
		sb.append(String.format("%06d", count));
		map.put(city[0].num, sb.toString());
		for (int i=1;i<M;i++) {
			if (befCity!= city[i].ken) {
				count =1;
				befCity= city[i].ken;
			} else {
				count++;
			}
			sb = new StringBuffer();
			sb.append(String.format("%06d", befCity));
			sb.append(String.format("%06d", count));
			map.put(city[i].num, sb.toString());
		}
		Object[] num = map.keySet().toArray();
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(map.get(num[i]));
		}
	}

	public class City implements Comparable<City> {
		int ken ;
		int birth;
		int num;
		@Override
		public int compareTo(City o) {
			if (this.ken > o.ken) {
				return 1;
			}
			if (this.ken < o.ken) {
				return -1;
			}
			if (this.birth < o.birth) {
				return -1;
			}
			if (this.birth > o.birth) {
				return 1;
			}
			return 0;
		}

	}
}