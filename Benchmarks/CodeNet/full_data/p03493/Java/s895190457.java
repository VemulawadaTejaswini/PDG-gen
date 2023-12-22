import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int cnt = 0;
		for(int i = 0; i < 3; i++) {
			if(a.charAt(i) == 1) cnt ++;
		}
		System.out.println(cnt);
	}
}