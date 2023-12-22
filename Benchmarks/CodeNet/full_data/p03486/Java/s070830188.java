import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        Arrays.sort(s);
        char[] t = sc.next().toCharArray();
        Arrays.sort(t);
        boolean ans = true;
        boolean broke = false;
        for (int i = 0; i < Math.min(s.length, t.length); i++) {
            if(t[t.length - i - 1] < s[i]){
                ans = false;
                break;
            } else if(s[i] < t[t.length - i - 1]){
                broke = true;
                break;
            }
        }
        if(ans && !broke){
            if(t.length <= s.length) ans = false;
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
        sc.close();

    }

}
