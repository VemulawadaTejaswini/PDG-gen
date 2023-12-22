import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i = 2; i < S.length(); i += 2) {
			String front = S.substring(0, S.length()/2-i/2);
			String back = S.substring(S.length()/2-i/2, S.length()-i);
			if (front.equals(back)) {
				String ans = front + back;
				System.out.println(ans.length());
				break;
			}
		}
	}
}