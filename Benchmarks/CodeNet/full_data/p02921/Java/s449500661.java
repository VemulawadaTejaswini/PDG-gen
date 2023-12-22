import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] yoho = sc.next().split("");
        String[] actual = sc.next().split("");
        int ans = 0;
        for(int i = 0; i < yoho.length; i++) {
          if (yoho[i].equals(actual[i])) {
            ans++;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}