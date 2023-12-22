import java.util.*;

public class Main {
	
	static List<Long> list = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long[] num = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for (long l : num) {
			list.add(l);
		}
		System.out.println(getMax(list));
		
	}
	
	public static long getMax(List<Long> li) {
		long c = 0;
		
		for(int i=0; i<li.size()-1; i++) {
			Set<Long> used = new HashSet<>();
			long max = 0;
			for(int j = i+1; j<li.size(); j++) {
				long ii = li.get(i);
				long jj = li.get(j);
				long v = ii + jj;
				if((v & (v-1)) == 0) {
					if(!(used.contains(ii) && used.contains(jj))) {
						used.add(ii);
						used.add(jj);
						//System.out.println(sublist(i,j,li));
						long m = 1 + getMax(sublist(i,j,li));
						max = Math.max(max, m);
					}
				}
			}
			c = Math.max(max, c);
		}
		return c;
		
	}
	
	public static List<Long> sublist(int i, int j, List<Long> l){
		ArrayList<Long> tmp = new ArrayList<>();
		for (long a : l) {
			tmp.add(a);
		}
		tmp.remove(i);
		tmp.remove(j-1);
		return tmp;
	}

}
