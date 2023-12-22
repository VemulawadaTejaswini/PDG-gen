import java.util.*;

public class Main {
    private static final long MODVAL = 1000000007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
//        int t = getMinLength("abc?e","cdefg");
        int l[] = new int[6];
        l[0] = getMinLength(a, b, c);
        l[1] = getMinLength(a, c, b);
        l[2] = getMinLength(b, a, c);
        l[3] = getMinLength(b, c, a);
        l[4] = getMinLength(c, a, b);
        l[5] = getMinLength(c, b, a);
        Arrays.sort(l);
        System.out.println(l[0]);
    }

    public static int getMinLength(String a, String b, String c) {
        return getMinLength(a, b) + getMinLength(b, c) - b.length();
    }

    public static int getMinLength(String a, String b) {
        for(int i=0; i<a.length(); i++) {
            boolean ok_flag = true;
            for(int t=0; t<a.length()-i && t<b.length(); t++) {
                if(a.substring(i+t, i+t+1).equals("?") || b.substring(t, t+1).equals("?")) continue;
                if(a.substring(i+t, i+t+1).equals(b.substring(t, t+1))) continue;
                ok_flag = false;
                break;
            }
            if(!ok_flag) continue;
            return i + b.length();
         }
        return a.length() + b.length();
    }
}
