
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 数値の入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pro = b;
        int target = 1;
        // 整数NをK進数で表した時のパターン
        while ( pro <= a) {
        	target ++;
        	pro *= b;
        }

        System.out.println(target);
    }
}
