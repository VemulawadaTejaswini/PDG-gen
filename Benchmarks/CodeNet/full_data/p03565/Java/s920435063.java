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
        char[] ans = new char[slen];
        boolean flg = false;
        if(s.indexOf(t)>=0) flg = true;
        for(int i=slen-tlen;i>=0;i--){
            if(!flg){
                if(diffCheck(S, T, i)){
                    for(int j=i;j<i+tlen;j++){
                        ans[j] = T[j-i];
                    }
                    flg = true;
                }else{
                    ans[i] = S[i]=='?'?'a':S[i];
                }
            }else{
                ans[i] = S[i]=='?'?'a':S[i];
            }
        }
        if(flg){
            for(int i=0;i<slen;i++){
                System.out.print(ans[i]);
            }
            System.out.println("");
        }else{
            System.out.println("UNRESTORABLE");
        }
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
