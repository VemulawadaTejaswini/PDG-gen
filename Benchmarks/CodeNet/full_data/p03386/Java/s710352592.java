import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
      
        for(int i = a; i < a + k; i++) {
          if (i <= b) {
            set.add(i);
          } else {
            break;
          }
        }
        for(int i = b - k + 1; i <= b; i++) {
          if (i >= a) {
            set.add(i);
          } else {
            break;
          }
        }
        
        for(Integer value : set) {
          // 出力
		  System.out.println(value);
        }

	}
}