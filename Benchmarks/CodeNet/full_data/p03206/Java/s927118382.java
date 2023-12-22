import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int n = 25 - a;
        String ans = "Christmas";
        for(int i = 0; i < n; i++) {
          ans += " Eve";
        }
    
		// 出力
		System.out.println(ans);
	}
}
