import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int target = Integer.parseInt("" + a + b);
       
        String ans = "";
        int value = 1;
        while(true) {
          int i = value * value;
          if (i == target) {
            ans = "Yes";
            break;
          } else if (i > target) {
            ans = "No";
            break;
          }
          value++;
        }
    
		// 出力
		System.out.println(ans);
	}
}