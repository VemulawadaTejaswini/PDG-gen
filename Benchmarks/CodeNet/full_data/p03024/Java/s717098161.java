import java.util.*;
import java.lang.*;


public class Main {
    static int countChar(String S, char c){
        int ans = 0;
        for(int i=0; i<S.length(); i++) if(S.charAt(i)==c) ans++;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(countChar(S,'x')<8 ? "YES" : "NO");
    }
}