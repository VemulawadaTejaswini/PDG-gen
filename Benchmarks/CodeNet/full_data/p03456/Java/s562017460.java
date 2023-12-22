import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll(" ", "");
		int sqrt = (int)(Math.sqrt(Double.parseDouble(s)) * 10);
		System.out.println(sqrt % 10 == 0 ? "Yes" : "No");
	}
}