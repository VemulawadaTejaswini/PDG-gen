import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		ArrayList<Character> list = new ArrayList<>();

		for(int i = 0; i < s.length; i++){
			if(s[i] == 'B'){
				if(list.size() != 0){
					list.remove(list.size()-1);
				}
			}else {
				list.add(s[i]);
			}
		}

		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
		}
		System.out.println();
	}
}