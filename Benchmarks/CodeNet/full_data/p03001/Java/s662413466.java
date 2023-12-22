import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		long s = W*H;
		System.out.print(s/2.0+" ");
		if(W/2.0==x&&H/2.0==y)System.out.println(1);
		else System.out.println(0);
	}
}