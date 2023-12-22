import java.util.Scanner;

class A {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final char[] S = sc.next().toCharArray();
        long ans = 0;
        for(int i = 0, b = 0; i < S.length; i++)
            if(S[i] == 'B')
                b++;
            else
                ans += b;
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
