import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 出力
		System.out.println(a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0 ? 
                           "Possible" : "Impossible");
	}
}
