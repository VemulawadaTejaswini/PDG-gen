import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        
        y = y/1000;
        
        if (check(n, y) == 0) {
            System.out.println(-1 + " " + -1 + " " + -1);
        }
    }
    
    static int check(int n, int y) {
        for (int i = 0; i <= y; i ++) {
            for (int j = 0; j <= y / 5; j ++) {
                for (int k =  0; k <= y / 10 ; k++) {
                    //System.out.println(i + " " + j + " " + k);
                    if (i + j + k == n && 10 * k + 5 * j + i == y) {
                        //System.out.println("-----");
                        System.out.println(k + " " + j + " " + i);
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
