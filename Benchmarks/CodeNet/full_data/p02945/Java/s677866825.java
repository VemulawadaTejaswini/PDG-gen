import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);

		//入力表示
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		int d=a-b;
		int e=a*b;

		int ans=Math.max(c,Math.max(d,e));

		 System.out.println(ans);
	}

}
