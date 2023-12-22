import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");

        int ans = 0;
        String last = "";
        for(String value : s) {
            if (!last.equals(value))  {
                ans++;
            }
            last = value;
        }

        // 出力
        System.out.println(ans);
    }
}