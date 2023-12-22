import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> sn = new HashSet<>();

        for (Integer i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 1) {
                s1.add(b);
            }
            if (b == n) {
                sn.add(a);
            }            
        }

        if (s1.retainAll(sn) || sn.retainAll(s1)) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
