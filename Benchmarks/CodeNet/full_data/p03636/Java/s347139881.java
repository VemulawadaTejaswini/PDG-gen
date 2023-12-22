
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        String s = sc.next();
        char first = s.charAt(0);
        char sec = s.charAt(s.length()-1);
        int t = s.length()-2;

        String str = String.valueOf(first);
        String str2 = String.valueOf(sec);

        System.out.println(str+t+sec);



    }

}