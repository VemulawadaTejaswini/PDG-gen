import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] ary = String.valueOf(n).toCharArray();
		int s = 0;
		for (char c : ary) {
			s += Character.getNumericValue(c);
		}
		System.out.println(n%s==0? "Yes":"No");
	}
}
