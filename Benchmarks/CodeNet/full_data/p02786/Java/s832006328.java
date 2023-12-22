
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if (h < 2) {
            System.out.println(h);
            return ;
        }
        // how 2:pow
        int p = 0;
        while (true) {
            double p1 = Math.pow(2, p);
            double p2 = Math.pow(2, p+1);
            if (p1 <= h && h < p2) {
                break;
            }
            p++;
        }

        int[] memo = new int[p+1];
      memo[1] = 3;
        for (int i=2;i<=p;i++) {
            memo[i] = (memo[i - 1] - 1) * 2 + 3;
        }

        System.out.println(memo[p]);

    }
}
