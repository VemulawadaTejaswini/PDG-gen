import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
        if((c >= 10)){
			// 出力
			System.out.println("Error");
        }else{
			// 出力
			System.out.println(c);
        }
	}

}
