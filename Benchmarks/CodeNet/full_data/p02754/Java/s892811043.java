import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b =scan.nextInt();
		int count = 0;
		String s = "";
		while(s.length() < n) {
			for(int i = 0 ; i < a ; i++) {
				s+="b";
			}
			for(int i = 0 ; i < b ; i++) {
				s+="r";
			}
		}
		String[] strArray = s.split("");
		for (int i = 0; i < n ; i++) {
			if(strArray[i].equals("b")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
