
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp  = scanner.nextLine().split(" ");
		int k    	  = Integer.parseInt(tmp[1]);
		Map<Integer, Integer> Cmap = new HashMap<Integer,Integer>();
		int bad  = 0;
		int good = 0;

		for(int i = 0; i < k ; i++) {

			String[] tmp1 = scanner.nextLine().split(" ");
			int a   	  = Integer.parseInt(tmp1[0]);
            String b      = tmp1[1];

			if(b.equals("WA")) {
				if(!Cmap.containsKey(a)) {
					bad++;
				}
			}else{
				if(!Cmap.containsKey(a)) {
					Cmap.put(a, 1);
					good++;
				}
			}
		}
		System.out.println(good + " " + bad);
	}
}