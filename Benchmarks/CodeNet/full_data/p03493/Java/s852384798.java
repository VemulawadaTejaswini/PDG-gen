import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum += s.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}