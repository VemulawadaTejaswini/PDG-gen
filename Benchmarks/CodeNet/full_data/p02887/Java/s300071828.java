import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        char prev = s.toCharArray()[0];
        int res = 1;
        for (char c : s.toCharArray()) {
            if (prev == c) {
                continue;
            }
            res++;
            prev = c;
        }

        System.out.println(res);
    }
}
