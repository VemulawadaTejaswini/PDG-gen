import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static class D {
        int x;
        int y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] chars = s.toCharArray();

        int n = 0;
        for (int i = 0; i < chars.length/2; i++) {
            if(chars[i]!=chars[chars.length-i-1]) n++;
        }
        System.out.println(n);
    }
}
