import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main{
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long k = scan.nextInt();
 
		SortedSet set = new TreeSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			set.add(a);
			if(map.containsKey(a)){
				map.put(a, map.get(a) + b);
			}else{
				map.put(a, b);
			}
		}
 
		for(Iterator it = set.iterator();;){
			int num = (int) it.next();
			k -= map.get(num);
			if(k <= 0){
				System.out.println(num);
				break;
			}
		}
 
	}
 
}
