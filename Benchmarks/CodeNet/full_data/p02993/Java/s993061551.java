import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		sc.close();

		String ans = "Good";
		for(int i = 0;i < ch.length-1;i++) {
			if(ch[i] == ch[i+1]) {
				ans = "Bad";
				break;
			}
		}
		System.out.println(ans);
	}

}