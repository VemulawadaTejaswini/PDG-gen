import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String input;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		String[] strArray = input.split("");
		for(String s : strArray) {
			if(s.equals("1")) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}