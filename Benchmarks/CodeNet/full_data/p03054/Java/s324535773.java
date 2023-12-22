import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        int H = sc.nextInt(), W = sc.nextInt(), n = sc.nextInt();
        int SR = sc.nextInt(), SC = sc.nextInt();
        char[] s = sc.next().toCharArray(), t = sc.next().toCharArray();
        boolean res = help(H,W,n,s,t,SR,SC);
        String ans = res?"YES":"NO";
        System.out.println(ans);
    }
    static boolean help(int H, int W, int n, char[] s, char[] t, int sr, int sc){
        HashMap<Character,Character> opp = new HashMap<>();
        opp.put('U','D');
        opp.put('D','U');
        opp.put('L','R');
        opp.put('R','L');
        int hi=1, lo=H,le=1,ri=W;
        if(s[n-1]=='U') lo++;
        else if(s[n-1]=='D') hi--;
        else if(s[n-1]=='L') le++;
        else ri--;
        for(int i=n-2;i>=0;i--){
            char cur = s[i];
            if(t[i]==opp.get(cur)) continue;
            if(cur=='L') le++;
            else if(cur=='R') ri--;
            else if(cur=='U') hi++;
            else lo--;
            if(t[i]=='L') ri=Math.min(W,ri+1);
            else if(t[i]=='R') le=Math.max(1,le-1);
            else if(t[i]=='U') lo = Math.min(lo+1,H);
            else hi = Math.max(hi-1,1);
            if(le>ri||lo<hi) return false;
            if(hi>sr||sr>lo||sc<le||sc>ri) return false;
        }
        return true;
    }
}
