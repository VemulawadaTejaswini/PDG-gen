import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int a = -1;
        int b = -1;

        for(int i=0; i<s.length(); i++) {
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
                a = i+1;
                b = i+2;
                break;
            }
            if(i < s.length() - 2 && s.charAt(i) == s.charAt(i+2)) {
                a = i+1;
                b = i+3;
                break;
            }
        }

        System.out.println(a + " " + b);

        in.close();
    }
}
