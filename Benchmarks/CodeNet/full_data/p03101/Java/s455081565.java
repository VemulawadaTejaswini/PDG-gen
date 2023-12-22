import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H= sc.nextInt();
		int W=sc.nextInt();
		int h=sc.nextInt();
		int w=sc.nextInt();
		int amount=H*W;
		int yoko = h*W;
		int tate = (H-h)*w;
		System.out.println(amount-yoko-tate);
	}
}
