
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		in.nextInt();
		
		
		while(in.hasNext()) {
			list.add(in.nextInt());
		}
		in.close();
		
		Collections.sort(list);
		
		int ans = 0;
		for(int i = 0; i < list.size(); i++) {
			ans += list.get(i);
			i++;
		}
		System.out.println(ans);
	}

}
