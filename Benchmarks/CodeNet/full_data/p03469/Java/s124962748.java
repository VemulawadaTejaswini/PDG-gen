import java.util.Scanner;
public class AC_085_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] x = input.split("/+");
		System.out.println("2018/01/"+x[2]);
	}
}