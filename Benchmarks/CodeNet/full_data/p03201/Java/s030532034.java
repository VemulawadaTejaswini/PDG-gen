import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] a = new long[N];
		for(int i=0;i<N;i++)a[i]=Long.parseLong(sc.next());
		Arrays.sort(a);

		Map<Long,Integer> map=new HashMap<>();
		for (Long l : a)map.put(l, map.getOrDefault(1, 0)+1);

		long res = 0;
		for(int i=N-1;i>=0;i--){
			if(map.get(a[i])==0) continue;
			map.put(a[i],map.get(a[i])-1);
			long diff=2*Long.highestOneBit(a[i])-a[i];
			if(map.containsKey(diff) && map.get(diff)>0){
				res++;
				map.put(diff,map.get(diff)-1);
			}
		}
		System.out.println(res);


	}

}