import java.util.*;
public class Main {
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // ボールの総数
        int n = sc.nextInt();

        // 末尾に加えた青いボールの数
        int a = sc.nextInt();

        // 末尾に加えた赤いボールの数
        int b = sc.nextInt();

        // 青いボールを加えた回数
        int num = n / (a + b) * a;

        // それ以外の青いボールの数
        int rem = n % (a + b);

        num += Integer.min(a, rem);

        // 出力
        System.out.println(num);
    }
}