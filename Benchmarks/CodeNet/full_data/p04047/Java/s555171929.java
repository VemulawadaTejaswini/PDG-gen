import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int n = in.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		in.close();
		
		Collections.sort(list, Collections.reverseOrder());
		
		int ans = 0;
		for(int i = 0; i < list.size(); i++) {
			ans += list.get(i);
			i++;
		}
		System.out.println(ans);
	}

}
