import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int O = S.length()-1;
        int ans = 1;
        char[] C = S.toCharArray();
        if (O% 2 == 1) {
            O = O - 1;
            ans++;
        }
        lavel:for (int i = 0; i < O/2;i=i+2) {
            for (int j = 0; j < (O-i) / 2; j++) {
                if (C[j] == C[(O-i) / 2 + j]){} else {
                    ans=ans+2;
                    continue lavel;
                }
            }
            break;
        }
        System.out.println(S.length()-ans);
    }
}