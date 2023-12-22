import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = sc.next().split("");

        int count = 0;
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < N; i++) {
            String s = S[i];
            if (s.equals("A")) {
                a = true;
                b = false;
            } else if (a && s.equals("B")) {
                b = true;
            } else if (a && b && s.equals("C")) {
                a = false;
                b = false;
                count++;
            } else {
                a = false;
                b = false;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
