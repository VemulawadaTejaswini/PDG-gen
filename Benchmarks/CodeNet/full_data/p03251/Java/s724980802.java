import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int maxX = x;
        int minY = y;
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > maxX) {
                maxX = value;
            }
        }
        for(int i = 0; i < m; i++) {
            int value = sc.nextInt();
            if (value < minY) {
                minY = value;
            }
        }

        // 出力
        System.out.println(minY > maxX ? "No War" : "War");
    }
}
