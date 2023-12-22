import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        long value1 = 2;
        long value2 = 1;
        if (n == 1) {
            // 出力
		    System.out.println(value2);
            return;
        }
        for(int i = 2; i < n; i++) {
          if (i % 2 == 0) {
            value1 = value1 + value2;
          } else {
            value2 = value1 + value2;
          }
        }

		// 出力
		System.out.println(value1 + value2);
	}
}