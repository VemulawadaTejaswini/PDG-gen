import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a-b <= c)
			System.out.println(c-(a-b));
		else
			System.out.println(0);
		
        sc.close();
	}
}