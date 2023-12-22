import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();

        long ans = 0;
        int up = 0;
        int down = 0;
        for (int i = 0; i < S.length; i++) {

            if (S[i] == '<') {
                up++;
            } else {
                down++;
            }

            if (i == S.length-1 || S[i] == '>' && S[i+1] == '<') {
                if (up == down || up == 0 || down == 0) {
                    ans += sum(up) + sum(down);
                } else if (up < down) {
                    ans += sum(up-1) + sum(down);
                } else {
                    ans += sum(up) + sum(down-1);
                }
                up = 0;
                down = 0;
            }
        }
        System.out.println(ans);
    }

    private static long sum(int n) {
        return (long)n*(n+1)/2;
    }
}
