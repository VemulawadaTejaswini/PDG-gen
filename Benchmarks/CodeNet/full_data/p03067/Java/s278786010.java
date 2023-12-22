import java.util.Scanner;
public class main {
	public main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		


		if(a < c && c < b ||
				b < c && c < a) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}


	}
}