import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n];
        int previous = 0;
        boolean decreased = false;
        boolean isFalse = false;
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          if (value >= previous) {
            previous = value;
          } else if ((previous - value) > 1){
            isFalse = true;
            break;
          } else if (!decreased) {
            previous = value -1;
            decreased = true;
          } else {
            isFalse = true;
            break;
          }
        }
        String ans = "";
        if (isFalse) {
          ans = "No";
        } else {
          ans = "Yes";
        }
    
		// 出力
		System.out.println(ans);
	}
}
