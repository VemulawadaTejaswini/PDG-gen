import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
        
        int start = a > c ? a : c;
        int end = b < d ? b : d;
        int ans = end > start ? end - start : 0;
        
    
		// 出力
		System.out.println(ans);
	}
}