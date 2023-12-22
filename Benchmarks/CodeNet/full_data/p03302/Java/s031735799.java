import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
        
        if (a + b == 15) {
          // 出力
		  System.out.println("+");
        } else if (a * b == 15) {
          // 出力
		  System.out.println("*");
        } else {
          // 出力
		  System.out.println("x");
        }
	}
}