import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String S = sc.next();

        int price = 700;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'o') {
                price += 100;
            }
        }
        out.printf("%d\n", price);
        out.flush();
    }
}