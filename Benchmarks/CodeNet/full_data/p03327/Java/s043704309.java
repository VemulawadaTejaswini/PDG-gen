import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		String ans=a<1000?"ABC":"ABD";
		System.out.println(ans);
	}
}