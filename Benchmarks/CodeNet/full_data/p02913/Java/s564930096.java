import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] cs = s.toCharArray();
        int maxLength = -1;
        for(int i = 0; i < cs.length; i++) {
            maxLength = Math.max(maxLength, zAlg(Arrays.copyOfRange(cs, i, cs.length)));
        }
        System.out.println(maxLength);
    }

    private static int zAlg(char[] cs) {
        int maxSubstring = -1;
        int[] Z = new int[cs.length];
        Z[0] = -1;
        int L = 0; //left most char included in prefix equals substring
        int R = 0; //rightmost char included in prefix equals substring
        for(int i = 1; i < Z.length; i++) {
            if(i > R) {
                //compute new L, R values
                L = i;
                int ct = 0;
                while(L + ct < Z.length && cs[ct] == cs[ct+L] && ct < i) {
                    ct += 1;
                }
                Z[i] = ct;
                R = L + ct - 1;
            } else {
                int K = i - L;
                if(Z[K] < R-i+1) {
                    //no prefix equal substring starting from i
                    Z[i] = Z[K];
                } else {
                    //possibly extend current prefix
                    L = i;
                    int ct = 0;
                    while(L + ct < Z.length && cs[ct] == cs[ct+L]) {
                        ct += 1;
                    }
                    Z[i] = ct;
                    R = L + ct - 1;
                }
            }
            if(Z[i] > maxSubstring) {
                maxSubstring = Z[i];
            }
        }
        return maxSubstring;
    }
}