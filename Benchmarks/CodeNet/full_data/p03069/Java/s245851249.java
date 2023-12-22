import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();;
        int count = N;
        for (int i = 0; i<N; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j ++) {
                if (S.charAt(j) == '#') left++;
            }
            for (int j = N-1; i < j; j--) {
                if (S.charAt(j) == '.') right++;
            }
            count = Math.min(count, left + right);
        }
        System.out.println(count);

    }
}