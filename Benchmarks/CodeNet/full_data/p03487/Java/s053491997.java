
import java.util.Arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int N = scan.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			if(hashMap.get(a[i]) == null) {
				hashMap.put(a[i], 1);
			} else {
				hashMap.put(a[i], (hashMap.get(a[i]) + 1));
			}
		}
		for(Integer i : hashMap.keySet()) {
			if(hashMap.get(i) == i) {
				
			} else {
				if(hashMap.get(i) < i) {
					sum += hashMap.get(i);
				} else {
					sum += hashMap.get(i) - i;
				}
			}
		}
		System.out.println(sum);
		scan.close();

	}

}
