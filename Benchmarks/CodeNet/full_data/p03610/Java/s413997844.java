import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int length = s.length();
		for (int t = 0; t <= length - 1; t =  t + 2) {
			System.out.print(s.charAt(t));
		}
	}
}