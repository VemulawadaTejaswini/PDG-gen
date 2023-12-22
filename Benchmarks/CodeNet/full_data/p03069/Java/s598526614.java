import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		String[] strs = s.split("");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<strs.length; i++) {
			if(strs[i].equals("#")) {
				list.add(i);
			}
		}
		if(list.size()==0) {
			System.out.println(0);
			return;
		}
		int sum = 0;
		
		if(list.get(list.size()-1) != strs.length) {
			for(int i=0; i+1<list.size(); i++) {
				sum += (list.get(i+1) - list.get(i) - 1);
			}
			sum += (strs.length - list.get(list.size()-1)-1);
		}else {
			for(int i=0; i+1<list.size(); i++) {
				sum += (list.get(i+1) - list.get(i) - 1);
			}
		}
		System.out.println(sum);
	}
}
