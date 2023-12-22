import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = check(s);
        System.out.println(ans ? "Yes" : "No");
        sc.close();

    }

    private static boolean check(String s) {
        if(s.length() == 1) return true;
        boolean ret = true;
        ret = isKaibun(s);
        if(ret){
            ret = check(s.substring(0, s.length()/2));
        }
        if(ret){
            ret = check(s.substring(s.length()/2 + s.length()%2, s.length()));
        }
        return ret;
    }

    private static boolean isKaibun(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
