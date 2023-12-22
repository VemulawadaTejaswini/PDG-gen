import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.replaceAll("dreameraser", "");
        S = S.replaceAll("dreamer", "");
        S = S.replaceAll("dream", "");
        S = S.replaceAll("eraser", "");
        S = S.replaceAll("erase", "");
        if(S.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}