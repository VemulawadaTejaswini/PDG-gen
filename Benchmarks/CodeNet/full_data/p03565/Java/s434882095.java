import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        
        boolean hantei = false;
        boolean hanteia = false;
        int count = 0;
        StringBuilder ans = new StringBuilder();
        StringBuilder ansa = new StringBuilder();
        String[] sa = s;
        for(int i=0; i<s.length; i++) {
            if(s[i].equals(t[count]) || s[i].equals("?")) {
                count++;
            }else {
                count = 0;
            }
            if(count == t.length) {
                int x = 0;
                for(int j=i-count+1; j<=i; j++) {
                    s[j] = t[x];
                    x++;
                }
                hantei = true;
                break;
            }
        }
        if(hantei) {
            for(int i=0; i<s.length; i++) {
                if(s[i].equals("?")) ans.append("a");
                else ans.append(s[i]);
            }
        }
        
        
        count = 0;
        for(int i=sa.length-1; i>=0; i--) {
            if(sa.length < t.length) break;
            if(sa[i].equals(t[t.length-1-count]) || sa[i].equals("?")) {
                count++;
            }else {
                count = 0;
                continue;
            }
            if(count == t.length) {
                int x = 0;
                for(int j=i; j<=i+t.length-1; j++) {
                    sa[j] = t[x];
                    x++;
                }
                hanteia = true;
                break;
            }
        }
        if(hanteia) {
            for(int i=0; i<sa.length; i++) {
                if(sa[i].equals("?")) ansa.append("a");
                else ansa.append(sa[i]);
            }
            if(hantei) {
                if(ans.compareTo(ansa) < 0) System.out.println(ans);
                else System.out.println(ansa);
            }
        }else {
            System.out.println("UNRESTORABLE");
        }
    }
}