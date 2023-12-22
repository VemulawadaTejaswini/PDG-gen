import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
    
		// 出力
		System.out.println(calc(n, a, b));
	}
  
    public static int calc(int n, int a, int b) {
      if (a == b) {
          return 1;
        }
      if (n < 2) {
        return 0;
      }
      if (a > b) {
        return 0;
      }
      int keta = n - 2;
      int haba = b - a;
      return keta * haba + 1;
    }
}