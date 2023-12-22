import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();

		String target = S.substring(K-1,K);

		S = S.replaceAll(target, "@");
		S = S.replaceAll("[^@]", "*");
		S = S.replaceAll("@", target);

		System.out.println(S);

	}


}
