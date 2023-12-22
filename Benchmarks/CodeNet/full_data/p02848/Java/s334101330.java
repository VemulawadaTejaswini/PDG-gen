import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c;
            if (S.charAt(i)+N <= 90)
                c= (char) (S.charAt(i) + N);
            else
                c= (char) (S.charAt(i) - (26 - N));
            ans.append(c);
        }
        System.out.println(ans);
    }
}