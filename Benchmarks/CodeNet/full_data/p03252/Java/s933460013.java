import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        int[] R = new int[26];
        int[] RDash = new int[26];

        for (int i = 0; i < 26; i++) {
            R[i] = -1;
            RDash[i] = -1;
        }

        boolean canConvert = true;
        for (int i = 0; i < S.length(); i++) {
            int S_i = S.charAt(i) - 97;
            int T_i = T.charAt(i) - 97;
            if (R[S_i] >= 0) {
                if (R[S_i] != T_i) {
                    canConvert = false;
                    break;
                }
            }
            if (RDash[T_i] >= 0) {
                if (RDash[T_i] != S_i) {
                    canConvert = false;
                    break;
                }
            }
            if (R[S_i] < 0) {
                R[S_i] = T_i;
            }
            if (RDash[T_i] < 0) {
                RDash[T_i] = S_i;
            }
        }

        if (canConvert) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}