import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)!=s.charAt(1)||s.charAt(1)!=s.charAt(2)) System.out.println("Yes");
        else System.out.println("No");

    }
}


