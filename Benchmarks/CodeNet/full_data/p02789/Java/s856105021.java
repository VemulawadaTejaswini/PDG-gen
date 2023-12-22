import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if(m>= n) {
			System.out.print("yes");
		}else {
			System.out.print("No");
		}
	}
}
