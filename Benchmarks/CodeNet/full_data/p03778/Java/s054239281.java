import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		answer = Math.abs(a-b)-W;
		if(Math.abs(a-b)<=W)answer = 0;
		System.out.println(Math.abs(answer));
	}

}
