import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        boolean found = false;
        int min = Integer.MAX_VALUE;
        
        if (r - l < 2019) {
            for (int i = l; i <= r - 1; i++) {
                for (int j = i + 1; j <= r; j++) {
                    int mod = i * j % 2019;
                    if (mod < min) {
                        //System.out.println(i + ", " + j);
                        min = mod;
                    }
                }
            }
        } else {
            min = 0;
        }
        System.out.println(min);
    }
}