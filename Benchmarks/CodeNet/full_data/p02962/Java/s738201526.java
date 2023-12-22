import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String T = in.nextLine();
        String S2 = S.concat(S);
        if (!S2.contains(T)) {
            System.out.println(0);
        } else {
            S2.replace(T, "A");
            int count = 0;
            int max = 0;
            for (int i = 0; i < S2.length; i++) {
                if (S2.charAt(i) == 'A') {
                    count++;
                } else {
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                }
                if (count == S.length() / T.length() && S.length() % T.length() == 0) {
                    max = -1;
                    break;
                }
            }
            System.out.println(max);
        }
    }