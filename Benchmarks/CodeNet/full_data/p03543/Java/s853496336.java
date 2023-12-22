import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        if(s[0]==s[1]&&s[1]==s[2]||s[1]==s[2]&&s[2]==s[3]) System.out.println("Yes");
        else System.out.println("No");


    }
}
