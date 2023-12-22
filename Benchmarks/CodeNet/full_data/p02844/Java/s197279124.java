import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int ans = main.solve();
        System.out.println(ans);
    }

    int solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] s = sc.next().toCharArray();
        HashSet<String> rec = new HashSet<>(1000);
        boolean[] res = new boolean[1000];
        int[] first = new int[10];
        for(int i=0;i<10;i++) first[i]= N+1;
        first[s[1]-'0'] = 1;
        first[s[0]-'0'] = 0;
        int[] sec = new int[10];
        for(int i=0;i<10;i++) sec[i]=-1;
        sec[s[0]-'0'] = 0; sec[s[1]-'0'] = 1;
        for(int idx=2;idx<N;idx++){
            int cur = s[idx]-'0';
            // check the 2nd digit;
            for(int j=0;j<10;j++){
                if(sec[j]<0) continue; // meaning that the number j hasn't appeared
                // Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
                for(int k=0;k<10;k++){
                    // lower(E e)
                    // Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
                    if(first[k] < sec[j]){
                        res[100*k+10*j+cur] = true;
                    }
                }
            }
            sec[cur] = idx;
            first[cur] = Math.min(first[cur],idx);
        }
        int ans = 0;
        for(int i=0;i<1000;i++) ans += res[i]?1:0;
        return ans;
    }
}