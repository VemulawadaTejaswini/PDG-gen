

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 2) {
                if (s[i] == s[i + 1]) {
                    System.out.println((i + 1) + " " + (i + 2));
                    return;
                }
                if (i < s.length - 3) {
                    if (s[i] == s[i + 2]) {
                        System.out.println((i + 1) + " " + (i + 3));
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1");
    }

}
