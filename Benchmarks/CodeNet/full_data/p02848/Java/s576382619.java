import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            c = (char) ((int) c + N);

            if (c > 90) {
                c = (char) ((int) (c % 90) + 64);
            }
            builder.append(c);
        }
        System.out.println(builder.toString());
    }
}