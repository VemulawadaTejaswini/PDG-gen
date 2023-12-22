import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Long>map =  new HashMap<>();
		long count=0;
		for(int i=0;i<n;i++) {
			char[] s= sc.next().toCharArray();
			Arrays.sort(s);
			String key=new String(s);
			if(map.containsKey(key)) {
				count+=map.get(key);
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, (long)1);
			}
		}
		System.out.println(count);
	}
}
