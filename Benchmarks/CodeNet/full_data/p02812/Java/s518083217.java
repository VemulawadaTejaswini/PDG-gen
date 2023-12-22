import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ind = S.indexOf("ABC");
		int cnt = 0;
	    while(ind >= 0){
			++cnt;
			ind = S.indexOf("ABC", ind + 1);			
		}
	    System.out.println(cnt);
	}
}
