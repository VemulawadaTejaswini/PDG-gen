import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        int c1 = 0;
        int c2 = 0;

        int count = 1;
        char tmp = S[0];
        for (int i = 1; i < S.length; i++) {
            if (tmp == S[i]) {
                count++;
            } else {
                c1 += count * 2;
                count = 1;
            }
            tmp = S[i];
        }

        count = 1;
        tmp = T[0];
        for (int i = 1; i < T.length; i++) {
            if (tmp == T[i]) {
                count++;
            } else {
                c2 += count * 2;
                count = 1;
            }
            tmp = T[i];
        }

        if (c1 == c2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}