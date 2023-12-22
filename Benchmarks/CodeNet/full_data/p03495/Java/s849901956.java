import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }
        int count = 0;
        while(map.size() > k) {
            int min = n+1;
            int idx = 0;
            for(int key : map.keySet()) {
                if(min > map.get(key)) {min = map.get(key); idx = key;}
            }
            count += min;
            map.remove(idx);
        }
        System.out.println(count);
	}
}