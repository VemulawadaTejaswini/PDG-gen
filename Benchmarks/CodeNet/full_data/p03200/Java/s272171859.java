import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        int Bcnt = 0;
        int Wcnt = 0;
        for (char c : s) {
            if (c == 'W')
                Wcnt++;
            if (c == 'B')
                Bcnt++;
        }

        System.out.println(Math.min(Bcnt, Wcnt) * 2);
    }
}
