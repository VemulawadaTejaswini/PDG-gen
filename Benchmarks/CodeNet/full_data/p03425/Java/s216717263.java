import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] record = new long[26];
        for(int i=0;i<N;i++){
            String cur = sc.next();
            char initial = cur.charAt(0);
            record[initial-'A'] += 1;
        }
        long[] med = new long[5];
        med[0] = record[0];
        med[1] = record['C'-'A'];
        med[2] = record['H'-'A'];
        med[3] = record['M'-'A'];
        med[4] = record['R'-'A'];
        long ans = 0;
        ans += med[0]*med[1]*med[2];
        ans += med[0]*med[1]*med[3];
        ans += med[0]*med[1]*med[4];
        ans += med[0]*med[2]*med[3];
        ans += med[0]*med[2]*med[4];
        ans += med[0]*med[3]*med[4];
        ans += med[1]*med[2]*med[3];
        ans += med[1]*med[2]*med[4];
        ans += med[1]*med[3]*med[4];
        ans += med[2]*med[3]*med[4];
        System.out.println(ans);


    }
}