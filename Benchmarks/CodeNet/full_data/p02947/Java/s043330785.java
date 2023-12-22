import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> sortedList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			sortedList.add(String.valueOf(c));
 
			String s = sortedList.get(i);
			if(map.containsKey(s)) {
				int num = map.get(s) + 1;
				ans += num;
				map.put(s, num);
			}else {
				map.put(s, 0);		
			}
		}
 
		System.out.println(ans);
		sc.close();
	}
 
}