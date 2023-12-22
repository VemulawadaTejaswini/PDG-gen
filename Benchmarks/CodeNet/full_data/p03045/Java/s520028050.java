import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		E(sc);
	}

	public static void E(Scanner sc) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<int[]> lis = new ArrayList<int[]>();
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt()%2;
			lis.add(new int[] {x,y,z});
		}
		Collections.sort(lis, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Math.min(a[0], a[1])-Math.min(b[0], b[1]);
			}
		});
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		int ret = 1;
		set1.add(lis.get(0)[0]);
		if(lis.get(0)[2]==0) set1.add(lis.get(0)[1]);
		else set2.add(lis.get(0)[1]);
		for(int i=1;i<m;i++) {
			int[] arr = lis.get(i);
			if(set1.contains(arr[0])) {
				if(arr[2]==0) set1.add(arr[1]);
				else set2.add(arr[1]);
			}
			else if(set2.contains(arr[0])) {
				if(arr[2]==0) set2.add(arr[1]);
				else set1.add(arr[1]);
			}
			else if(set1.contains(arr[1])) {
				if(arr[2]==0) set1.add(arr[0]);
				else set2.add(arr[0]);
			}
			else if(set2.contains(arr[1])) {
				if(arr[2]==0) set2.add(arr[0]);
				else set1.add(arr[0]);
			}
			else {
				ret++;
				set1.add(arr[0]);
				if(arr[2]==0) set1.add(arr[1]);
				else set2.add(arr[1]);
			}
		}
		ret += n-set1.size()-set2.size();
		System.out.println(ret);
	}
}