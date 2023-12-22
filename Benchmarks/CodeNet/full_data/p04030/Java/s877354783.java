import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'B') {
					if(list.size() > 0) {
						list.remove(list.size() - 1);
					}
			}else {
				list.add(String.valueOf(s.charAt(i)));
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String t : list) {
			sb.append(t);
		}
		System.out.println(sb.toString());
	}
}