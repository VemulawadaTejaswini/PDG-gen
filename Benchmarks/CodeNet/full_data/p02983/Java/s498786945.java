import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        boolean found = false;
        
        for (int i = l; i <= r - 1; i++) {
            for (int j = i + 1; j <= r; j++) {
                for (int k = 0; k <= i * j; k++) {
                    if (i * j % 2019 == k % 2019) {
                        System.out.println(k);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }
    }
}