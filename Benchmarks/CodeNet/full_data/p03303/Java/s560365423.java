import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] S = sc.next().toCharArray();
        final int w = sc.nextInt();
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length; i += w)
            sb.append(S[i]);
        System.out.println(sb);
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}
