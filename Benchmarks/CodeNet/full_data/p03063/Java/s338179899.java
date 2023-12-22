import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] bLeft = new int[n+2], wRight = new int[n+2];
        for(int i=0;i<n;i++) bLeft[i+1] = bLeft[i]+(s[i]=='#'?1:0);
        for(int i=n-1;i>=0;i--) wRight[i+1] = wRight[i+2]+(s[i]=='.'?1:0);
        int ans = n;
        for(int i=1;i<=n;i++){
            int cur = bLeft[i-1]+wRight[i];
            ans = Math.min(ans,cur);
        }
        ans = Math.min(ans,bLeft[n]);
        System.out.println(ans);
    }
}
