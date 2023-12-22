import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();
        String ans = f(S1)+f(S2)+f(S3);
        System.out.println(ans);
    }
    static String f(String S){
        char c = (char)(S.charAt(0)-'a'+'A');
        return String.valueOf(c);
    }
}
