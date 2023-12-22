import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long result = 0L;
        result += count(S, 'R', 'G', 'B');
//        result += count(S, 'R', 'B', 'G');
        result += count(S, 'G', 'R', 'B');
//        result += count(S, 'G', 'B', 'R');
        result += count(S, 'B', 'R', 'G');
//        result += count(S, 'B', 'G', 'R');

        System.out.println(String.format("%d", result));
    }
    static long count(String S, char A, char B, char C) {
        long result = 0L;
        for(int a=0; a<S.length(); a++) {
            char tmp_a = S.charAt(a);
            if(tmp_a!=A) continue;
            for(int b=a+1; b<S.length(); b++) {
                char tmp_b = S.charAt(b);
                if(tmp_b!=B && tmp_b!=C) continue;
                for(int c=b+1; c<S.length(); c++) {
                    if((c-b)==(b-a)) continue;
                    char tmp_c = S.charAt(c);
                    if(tmp_c!=B && tmp_c!=C) continue;
                    if(tmp_b==tmp_c) continue;
                    result++;
                }
            }
        }
        return result;
    }
}
