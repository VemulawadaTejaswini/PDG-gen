import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String n = inp.next();
        String ans = isp(n) ? "Yes" : "No";
        System.out.println(ans);
    }
    public static boolean isp(String s) {
        char ss[] = s.toCharArray();
        char pp[] = new char[ss.length];
        for (int i = 0; i < ss.length; i++) {
            pp[ss.length - i - 1] = ss[i];
        }
        return Arrays.equals(ss, pp);
    }
}