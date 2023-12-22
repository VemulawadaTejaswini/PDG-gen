import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        String T = s[2]+s[1]+s[0];
        if(S.equals(T)) System.out.println("Yes");
        else System.out.println("No");
    }
}