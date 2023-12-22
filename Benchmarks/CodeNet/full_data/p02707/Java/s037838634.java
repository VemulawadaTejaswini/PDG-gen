import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int wk=0;
		int ans=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=2;i<=N;i++){
			wk=sc.nextInt();
			if (map.containsKey(wk)){
			map.put(wk, map.get(wk)+1);
			}
			else{
			map.put(wk, 1);
			}
		}
		// mapキーでソートする
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		for(int i=1;i<=N;i++){
			if (map.containsKey(i)){
			System.out.println(map.get(i));
			}
			else{
			System.out.println(ans);
			}
			}
    }
}