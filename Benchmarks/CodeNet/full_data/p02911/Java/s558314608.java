import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < q; i++) {
          points[sc.nextInt() - 1] += 1;
          
        }
        for (int i = 0; i < n; i++) {
          System.out.println(q - points[i] < k ? "Yes" : "No");
        }
	}
}
