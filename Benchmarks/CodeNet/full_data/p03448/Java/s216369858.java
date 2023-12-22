import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n500 = sc.nextInt();
        int n100 = sc.nextInt();
        int n50 = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= n500; i++) {
            for (int j = 0; j <= n100; j++) {
                for (int k = 0; k <= n50; k++) {
                    if (i * 500 + j * 100 + k * 50 == x) {
                        count++;
                    }
                }
            }
        }
        // 出力
        System.out.println(count);
    }
}
