import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Aflg = 0,Cflg = 0;
		if(S.charAt(0) == 'A') Aflg = 1;
		for(int i = 2;i < S.length() - 2;i ++) {
			if(S.charAt(i) == 'C') {
				Cflg = 1;
				break;
			}
		}
		if(Aflg == 1 && Cflg == 1) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
}