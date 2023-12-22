
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			list.add(k);
		}
		boolean flag = true;
		
		for (int j = 0; j < list.size(); j++) {
			list.get(j);
			int plus = 0;
			for(int l = 0; l < list.size(); l++) {
				plus += list.get(l);
			}
			plus -= list.get(j);
			if(list.get(j) >= plus) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
	}
}