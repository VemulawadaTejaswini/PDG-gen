import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
          points[i] = k;
        }
        for (int i = 0; i < q; i++) {
          int winner = sc.nextInt();
          for(int index = 0; index < n; index++) {
             points[index] -= index == winner - 1 ? 0 : 1;
          }
        }
        for (int i = 0; i < n; i++) {
          System.out.println(points[i] > 0 ? "Yes" : "No");
        }
	}
}