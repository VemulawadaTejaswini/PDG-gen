import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'B') {
				if(i == 0) {
				} else if(list.size() == 0){
				} else {
					list.remove(list.size() - 1);
				}
			} else {
				list.add(s.charAt(i) + "");
			}
		}
		for(String a:list) {
			System.out.print(a);
		}
		System.out.println();
	}
}