
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        boolean A = false;
        boolean B = false;
        for(int i = 0; i < s.length; i++) {
            if(s[i] == 'A') A = true;
            if(s[i] == 'B') B = true;
        }
        if(A && B)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
