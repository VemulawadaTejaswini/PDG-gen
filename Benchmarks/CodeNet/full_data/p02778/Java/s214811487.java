

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.next().length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += "x";
        }
        System.out.println(ans);
        sc.close();
    }
}