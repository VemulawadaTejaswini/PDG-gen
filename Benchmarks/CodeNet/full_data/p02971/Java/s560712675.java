import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i<n; i++) {
			a[i]= sc.nextInt();
		}		
		for(int i=0; i<a.length; i++) {
			Integer temp = a[i];
			a = remove(a,i);
			Arrays.parallelSort(a, Comparator.reverseOrder());
			a = add(a,i,temp);
		}		
	}
	public static Integer[] remove(Integer[] target, int i) {
		List<Integer> temp = new ArrayList<>(Arrays.asList(target));
		temp.remove(target[i]);
		return temp.toArray(new Integer[0]);
	}
	public static Integer[] add(Integer[] target,int i1, Integer i2) {
		List<Integer> temp = new ArrayList<>(Arrays.asList(target));
		temp.add(i1, i2);
		return temp.toArray(new Integer[0]);
	}
}