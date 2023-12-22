import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
      
        int ans = 0;
      　　    
		if (n >= 10000) {
          ans += 909;
          ans += (n - 9999);
        } else if (n >= 100) {
          ans += 9;
          ans += (n - 99);
        } else if (n >= 10) {
          ans = 9;
        } else {
          ans = n;
        }
    
		// 出力
		System.out.println(ans);
	}
}
