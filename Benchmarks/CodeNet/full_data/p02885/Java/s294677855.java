import java.util.Scanner;
public class example1{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a-2*b >= 0 ? a-2*b : 0);
	}
	
}
