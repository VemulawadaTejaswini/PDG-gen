import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] n = sc.next().split("");
      
		// 出力
		System.out.println(n[0].equals(n[2]) ? "Yes" : "No");
	}
}
