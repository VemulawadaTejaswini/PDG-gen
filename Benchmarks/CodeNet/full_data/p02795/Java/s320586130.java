import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b) {
       		ans = c / a;
           if (c % a != 0) {
             ans++;
           }
        } else {
       		ans = c / b;
           if (c % b != 0) {
             ans++;
           }
        }
		// 出力
		      
			System.out.println(ans);
	}
}