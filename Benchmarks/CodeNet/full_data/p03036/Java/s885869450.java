import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int d = sc.nextInt();
        int start = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int value = r * start - d;
            start = value;
            // 出力
            System.out.println(value);
        }
    }
}