import java.util.*;

/**
 * Created by ml_qi on 2016/9/20.
 */
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long result = 0L;
        int k = 1;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (i == 0) {
                result += a - 1;
                k++;
            } else {
                if (a == k) {
                    k++;
                } else {
                    result += (a - 1) / k;
                }
            }
        }
        System.out.println(result);
    }


}
