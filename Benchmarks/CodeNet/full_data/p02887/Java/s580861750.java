import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        char[] S = s.toCharArray();
        int counter = 0;
        char temp = S[0];
        for (int i=1; i<N; i++) {
            if (S[i]==temp) {
                S[i] = ' ';
            } else {
                temp = S[i];
            }
        }
        String out = "";
        for (int i=0; i<N; i++) {
            if (S[i]!=' ') {
                out += S[i];
            }
        }
        System.out.println(out.length());
    }
}
