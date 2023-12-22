import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
		int N = 1_000_005;
		int value=s;
		int[] array = new int[N];
		HashSet<Integer> set = new HashSet<Integer>();
		array[0]=s;
		set.add(s);
		for (int i=0;i<N;i++) {
			array[i+1]=f(array[i]);
			if  (set.contains(array[i+1])) {
				System.out.println(i+2);
				break;
			} else {
				set.add(array[i+1]);
			}
		}
	}

	static int f(int n) {
		if (n%2==0) {
			return n/2;
		} else {
			return n*3+1;
		}
	}
}