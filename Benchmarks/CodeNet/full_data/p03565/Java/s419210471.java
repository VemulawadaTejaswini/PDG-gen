import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int slen = S.length;
        int tlen = T.length;
        char[] ans = null;
        for(int i=slen-tlen;i>=0;i--){
            if(diffCheck(S, T, i)){
                char[] tans = S.clone();
                for(int j=i;j<i+tlen;j++){
                    tans[j] = T[j-i];
                }
                if(ans == null || diff(ans,tans)>0){
                    ans = tans;
                }
            }
        }
        for(int i=0;i<ans.length;i++) ans[i]=ans[i]=='?'?'a':ans[i];
        System.out.println(String.valueOf(ans));
    }
    private static int diff(char[] a, char[] b){
        for(int i=0,e=Math.min(a.length,b.length);i<e;i++){
            char c1 = a[i]=='?'?'a':a[i];
            char c2 = b[i]=='?'?'a':b[i];
            if(c1<c2) return -1;
            if(c1>c2) return 1;
        }
        return 0;
    }
    private static boolean diffCheck(char[] a, char[] b, int as){
        for(int i=0;i<b.length;i++){
            if(a[i+as] != b[i]){
                if(a[i+as] != '?'){
                    return false;
                }
            }
        }
        return true;
    }
}
