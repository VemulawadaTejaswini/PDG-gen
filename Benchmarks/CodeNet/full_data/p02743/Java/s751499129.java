import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(sqrt(a) + sqrt(b) < sqrt(c) ? "Yes" : "No");
    }
}
