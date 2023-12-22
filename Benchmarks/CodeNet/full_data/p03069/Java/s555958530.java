import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int c1 = check(s, 0);
        int c2 = check(s, 1);
        System.out.println(c1 == s.length() ? "0" : c2 == s.length() ? "0" : c1 > c2 ? c2 : c1);
    }
    
    private static int check(String s, int ver) {
        char[] a = s.toCharArray();
        int c = 0;
        boolean check = false;
        if (ver == 0) {
            for (int i=0; i < a.length; i++) {
                if (a[i] == '#') check = true;
                if (a[i] == '.' && check) c++;
            }
        } else {
            for (int i=0; i < a.length; i++) {
                if (a[i] == '#') c++;
            }
        }
        return c;
    }
}