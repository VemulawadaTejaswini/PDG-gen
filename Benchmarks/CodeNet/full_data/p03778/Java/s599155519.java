import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int w = sc.nextInt();
		int aMin = sc.nextInt();
		int bMin = sc.nextInt();
        int aMax = aMin + w;
        int bMax = bMin + w;
        int ans = 0;
        if (aMin > bMin) {
          ans = aMin > bMax ? aMin - bMax : 0;
        } else {
          ans = bMin > aMax ? bMin - aMax : 0; 
        }
        // 出力
		System.out.println(ans);
	}
}