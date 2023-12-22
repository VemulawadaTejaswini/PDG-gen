import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		Map<Integer, Integer> ans = new HashMap<Integer,Integer>();


		for(int i = 0; i < n; i++) {

			String[] list = scanner.nextLine().split(" ");
			for(int j = 1; j < list.length; j++) {

				int put =  Integer.parseInt(list[j]);
				if(ans.containsKey(put)) {
					ans.put(put, ans.get(put) + 1);
				}else {
					ans.put(put, 1);
				}
			}
		}
		int a = 0;
		for(Entry<Integer, Integer> entry : ans.entrySet()) {

			if(entry.getValue() == n) {
				a++;
			}
		}
		System.out.println(a);
	}

}