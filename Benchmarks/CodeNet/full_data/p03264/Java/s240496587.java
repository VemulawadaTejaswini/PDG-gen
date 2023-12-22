import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int k = sc.nextInt();
        
        int amari = k % 2;
        int value = (k - amari) / 2;
        
		// 出力
		System.out.println(value * (value + amari));
	}
}
