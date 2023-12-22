import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        sc.close();

        System.out.println(CombineString(N, S, T));
    }
    public static String CombineString(int N, String S, String T) {
        if (S.length() < 1 || T.length() < 1) {
            return "";
        }
        return S.substring(0, 1) + T.substring(0, 1) + CombineString(N-1, S.substring(1), T.substring(1));
    }
}
