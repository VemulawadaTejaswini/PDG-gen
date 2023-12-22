import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt(); //h行
		int w = stdIn.nextInt(); //w列
		int n = stdIn.nextInt(); //塗らなければいけない個数
		
		int l = Math.max(h, w);
		
		int ans = (n+l-1)/l;
		System.out.println(ans);
		
		
		
	}

}
