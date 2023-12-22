
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String S = sc.next();
        sc.close();
        /*
         * HashSet<String> map = new HashSet<String>(); for(int l=0;l<S.length();l++){
         * for(int r = l+1;r+(r-l)<S.length();r++){ String ls = S.substring(l,r-1);
         * if(map) } }
         */

        // for(char start = 'a';start<='z';start++){
        // for(int i=0;i)
        // }

        // HashMap<String,Integer> map = new HashMap<String>();

        // String[][] dp = new String[5000][2500]
        char[] s = S.toCharArray();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = S.length()/2; j < S.length(); j++) {
                if(j+ans>=S.length() || i+ans>=j)break;
                int k = 0;
                while (j + k < S.length() && i + k < j && s[i+k] == s[j + k]){
                    k++;
                    // System.out.println(S.substring(i,i+k));
                }
                ans = Math.max(ans, k);
            }
            for (int j = S.length()/2; i < j; --j) {
                if(j+ans>=S.length() || i+ans>=j)break;
                int k = 0;
                while (j + k < S.length() && i + k < j && s[i+k] == s[j + k]){
                    k++;
                    // System.out.println(S.substring(i,i+k));
                }
                ans = Math.max(ans, k);
            }
        }
        
        System.out.println(ans);

        // int[] A = new int[N];
        // char[] s = S.toCharArray();
        // int c = 0;
        // for (int i = 1; i < S.length(); i++) {
        // if (i + A[i - c] < c + A[c]) {
        // A[i] = A[i - c];
        // } else {
        // int j = Math.max(0, c + A[c] - i);
        // while (i + j < S.length() && s[j] == s[i + j])
        // ++j;
        // A[i] = j;
        // c = i;
        // }
        // }
        // A[0] = S.length();

        // System.out.println(Arrays.toString(A));
        // System.out.println(c);
    }
}