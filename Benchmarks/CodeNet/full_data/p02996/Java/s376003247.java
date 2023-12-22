import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Integer> hash = new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			if(hash.containsKey(b)) {
				hash.put(b, hash.get(b)+a);
			}else {
				hash.put(b, a);
			}
		}
		long nowVal = 0;
		for(Integer key:hash.keySet()) {
			nowVal += hash.get(key);
			if(nowVal>key) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}