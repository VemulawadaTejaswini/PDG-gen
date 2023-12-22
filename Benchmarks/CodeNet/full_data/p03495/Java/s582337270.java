package atcoder;

/**
 *
 * @author Rajib Paul
 *
 *
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kunt[] = new int[200009];
        int n = in.nextInt();
        int k = in.nextInt();
        for(int i = 1; i <= n; i++){
            int x = in.nextInt();
            kunt[x]++;
        }
        Vector <Integer> inp = new Vector <Integer>();
        for(int i = 1; i <= 200000; i++){
            if(kunt[i] > 0){
                inp.addElement(kunt[i]);
            }
        }
        Collections.sort(inp);
        int SZ = inp.size();
        int ans = 0;
        if(SZ <= k) System.out.println(0);
        else {
            for(int i = 0; i < SZ - k; i++){
                ans += inp.get(i);
            }
        }
        System.out.println(ans);
    }
}