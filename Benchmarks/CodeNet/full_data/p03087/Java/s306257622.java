import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] sp = S.split("");
        int[] l = new int[Q];
        int[] r = new int[Q];
        
        for(int i = 0; i < Q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
            int count = 0;
            for(int j = l[i]; j < r[i]; j++) {
                if(sp[j-1].equals("A") && sp[j].equals("C")) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}