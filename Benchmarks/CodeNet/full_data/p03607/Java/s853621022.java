import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			
			if(list.contains(a)) {
				list.remove(Integer.valueOf(a));
			}else{
				list.add(a);
			}
		}
		
		System.out.println(list.size());
		
	}
}
