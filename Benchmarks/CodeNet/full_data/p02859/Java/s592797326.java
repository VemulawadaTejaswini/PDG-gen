import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int r = Integer.parseInt(sc.next());
        int ans;

        ans = r * r;

        // 出力
        System.out.println(Integer.toString(ans));
    }
}
