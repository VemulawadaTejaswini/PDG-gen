import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		S = S.replace("/","");
		String ans = (Integer.valueOf(S)>20190430 ? "TBD":"Heisei");
		System.out.println(ans);
	}

}