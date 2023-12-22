import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		for (int i=1; i<=S.length(); i++){
			if (S.substring(0, (S.length()-i)/2).equals(S.substring((S.length()-i)/2, S.length()-i))){
				System.out.println(S.length()-i);
			}
		}
	}
}