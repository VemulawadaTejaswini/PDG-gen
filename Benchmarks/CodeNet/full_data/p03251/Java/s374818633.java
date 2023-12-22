import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		String[] xArray = sc.nextLine().split(" ");
		String[] yArray = sc.nextLine().split(" ");

		String ans = "War";

		int xLast = Integer.parseInt(xArray[xArray.length-1]);
		int yFirst = Integer.parseInt(yArray[0]);
		if(x <= xLast && xLast <= yFirst && yFirst <= y){
			ans ="No War";
		}

		// 出力
		System.out.println(ans);
	}
}