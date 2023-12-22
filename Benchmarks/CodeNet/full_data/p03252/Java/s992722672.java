import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] S = new String[26];
        String[] T = new String[26];
        for (int i=0;i<26;i++){
            String ss = null;
            for (int j=0;j<s.length();j++){
                if (s.charAt(j)==letter[i]){
                    ss = ss + "1";
                }else {
                    ss = ss + "0";
                }
            }
            S[i] = ss;
            String tt = null;
            for (int j=0;j<t.length();j++){
                if (t.charAt(j)==letter[i]){
                    tt = tt + "1";
                }else {
                    tt = tt + "0";
                }
            }
            T[i] = tt;
        }
        Arrays.sort(S);
        Arrays.sort(T);
        boolean b = true;
        for (int i=0;i<26&&b;i++){
            if (!S[i].equals(T[i]))b=false;
        }
        if (b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
