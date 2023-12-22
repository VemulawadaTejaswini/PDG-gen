import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] points = new int[n];
        for(int i = 0; i < n; i++) {
          points[i] = sc.nextInt();
        }
        Arrays.sort(points);
        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
          ans += points[i + 1] - points[i];
        }
    
		// 出力
		System.out.println(ans);
	}
}