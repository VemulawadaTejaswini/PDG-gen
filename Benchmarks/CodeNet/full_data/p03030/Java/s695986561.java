import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = Integer.parseInt(sc.next());
	restaurant[] res = new restaurant[n];

	for(int i = 0; i < n; i++) {
		res[i] = new restaurant(sc.next(),sc.nextInt(),i+1);
	}

	Arrays.sort(res, new Comparator<restaurant>(){
		public int compare(restaurant R1, restaurant R2) {
			if(R1.name.equals(R2.name)) {
				return R2.point - R1.point;
			}
			return R1.name.compareTo(R2.name);
		}});
	for(restaurant r : res)
		System.out.println(r.num);

	sc.close();
	}

	static class restaurant{
		private final String name;
		private final int point;
		private final int num;
		restaurant(String name, int point, int num){
			this.name = name; this.point = point; this.num = num;
		}
	}
}
