import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		int max = 1;
		Map<String,Integer> map = new TreeMap<String,Integer>();
		for (int i=0;i<n;i++) {
			String s = sc.next();
			if (map.containsKey(s)==false) {
				map.put(s, 1);
			} else {
				Integer in = map.get(s);
				in = in+1;
				if (in>max) {
					max = in;
				}
				map.put(s, in);
			}
		}
		Object[] array = map.keySet().toArray();
		Arrays.sort(array);
		for (int i=0;i<array.length;i++) {
			if (map.get(array[i])== max) {
				System.out.println(array[i]);
			}
		}
	}


}