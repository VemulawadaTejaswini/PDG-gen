import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String b = scn.next();
		int c = scn.nextInt();
		if(b.equals("+")){
			System.out.println(a + c);
		} else {
			System.out.println(a - c);
		}
	}

}
