import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ans = 0;
      
        if(a == 0){
            ans = b / x + 1;
        }else{
            ans = b / x - a / x + 1;
        }
        System.out.println(ans);
    }
}