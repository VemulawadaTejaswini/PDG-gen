import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
      
		// 出力
		System.out.println(check(n) ? "Yes" : "No");
	}
    public static boolean check(int target) {
      if (target % 4 == 0) {
        return true;
      }
      int i = 0;
      while(true) {
        int value = target - i * 4;
        if (value % 7 == 0) {
          return true;
        }
        if (value < 7) {
          return false;
        }
        i++;
      }
    }
}