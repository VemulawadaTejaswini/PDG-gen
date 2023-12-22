import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<N;i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		list.add(X);
		Collections.sort(list);

		int[] diff = new int[N];
		for (int i=0;i<N;i++) {
			diff[i] = list.get(i+1)-list.get(i);
		}
		Arrays.sort(diff);
		int min = diff[0];
		ArrayList<Integer> divisor_min = divisor(min);
		Collections.sort(divisor_min, Collections.reverseOrder());
		for (Integer element : divisor_min) {
			int flag = 0;
			for (int element_diff : diff) {
				if (element_diff%element!=0) {
					flag = 1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(element);
				break;
			}
		}
	}

	static ArrayList<Integer> divisor(int n) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for (int i=1;i<=Math.sqrt(n);i++) {
	        if (n%i==0) {
	            list.add(i);
	            if (i*i!=n) {
	                list.add(n/i);
	            }
	        }
	    }
	    Collections.sort(list);
	    return list;
	}
}