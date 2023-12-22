import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        int gap = b - a;
        int sum = 0;
        for(int i = 1; i <= gap; i++) {
          sum += i;
        }
    
		// 出力
		System.out.println(sum - b);
	}
}