import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
        int consumed = 0;
        for(int i = 0; i < n; i++) {
          int value = sc.nextInt();
          int index = 0;
          while(index * value + 1 <= d) {
            consumed++;
            index++;
          }
        }
    
		// 出力
		System.out.println(consumed + x);
	}
}