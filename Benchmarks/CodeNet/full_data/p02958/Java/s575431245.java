import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList();
		for (int i=0; i<n; i++) {
			list.add(scan.nextInt());
		}
		
		List<Integer> sorted = new ArrayList(list);
		Collections.sort(sorted);
		
		if (list.equals(sorted) || isChangeable(list, sorted)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static boolean isChangeable(List list, List sorted) {
		boolean isChangeable = false;
		int notEqualCount = 0;
		List<Integer> indexList = new ArrayList();
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) == sorted.get(i)) continue;
			if (notEqualCount > 3) break;
			
			indexList.add(i);
			notEqualCount++;
		}
		
		if (indexList.size() == 2) {
			int tmp = (Integer) list.get(indexList.get(0));
			list.set(indexList.get(0), list.get(indexList.get(1)));
			list.set(indexList.get(1), tmp);
			
			if (list.equals(sorted)) {
				isChangeable = true;
			}
		}
		return isChangeable;
	}
}