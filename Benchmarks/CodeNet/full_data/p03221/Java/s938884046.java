import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        long[] y = new long[m];
        long[] z = new long[m];
        for(int i = 0; i < m; i++){
            p[i] = sc.nextInt();
            y[i] = sc.nextLong();
            z[i] = y[i];
        }
        int[] ans1 = new int[m];
        int[] ans2 = new int[m];
        for(int i = 0; i < m; i++){
            ans1[i] = p[i];
        }
        Arrays.sort(z);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(y[i] == z[j]){
                    ans2[i] = j;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(ans2[i] < ans2[j] && p[i] != p[j]){
                    ans2[j] --;
                }
            }
        }
        String[] Ans1 = new String[m];
        String[] Ans2 = new String[m];
        int[] len1 = new int[m];
        int[] len2 = new int[m];
        for(int i = 0; i < m; i++){
            Ans1[i] = String.valueOf(ans1[i]);
            Ans2[i] = String.valueOf(ans2[i]+1);
            len1[i] = Ans1.length;
            len2[i] = Ans2.length;
        }
        for(int i = 0; i < m; i++){
            while(len1[i] <= 7){
                Ans1[i] = "0" + Ans1[i];
                len1[i] ++;
            }
            while(len2[i] <= 7){
                Ans2[i] = "0" + Ans2[i];
                len2[i] ++;
            }
            System.out.println(Ans1[i] + Ans2[i]);
        }
    }
}
