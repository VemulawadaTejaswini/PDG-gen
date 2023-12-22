import java.util.Scanner;

public class Main {

	private final static String[] S = new String[]{
			"SUN","MON","TUE","WED","THU","FRI","SAT"
			};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		for(int i = 0;i < S.length;i++){
			if(s.equals(S[i])){
				System.out.println(7-i);
				break;
			}
		}
	}

}