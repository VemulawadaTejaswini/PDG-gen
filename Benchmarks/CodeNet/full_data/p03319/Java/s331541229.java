import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        int cur = 0;
        while (cur < n) {
            if (res == 0) {
                cur += k;
            }  else {
                cur += k -1;
            }
            res++;
        }
        System.out.println(res);

    }

}