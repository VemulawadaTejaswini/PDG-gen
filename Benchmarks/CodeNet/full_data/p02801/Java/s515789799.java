import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h"
                , "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"
                , "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < alphabets.length; i++) {
            if (C.equals(alphabets[i])) {
                if (i == alphabets.length -1) {
                    System.out.println(alphabets[0]);
                } else {
                    System.out.println(alphabets[i + 1]);
                }
            }
        }
    }
}