import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Map<Integer,Integer> Amap = new HashMap<>();
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
			if(Amap.containsKey(A[i])) {
				Amap.put(A[i], Amap.get(A[i])+1);
			}else {
				Amap.put(A[i],1);
			}
		}
		sc.close();
		int cnt = 0;
		for(Entry<Integer,Integer> Aentry : Amap.entrySet()) {
			if(Aentry.getValue()%2 != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}