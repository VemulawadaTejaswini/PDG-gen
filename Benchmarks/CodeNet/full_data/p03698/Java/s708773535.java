import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] cstr = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<cstr.length;i++){
			if(set.contains(cstr[i])){
				System.out.println("no");
				return ;
			}else{
				set.add(cstr[i]);
			}
		}
		System.out.println("yes");
	}
}
