import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zzt on 17-1-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        int K = scanner.nextInt();
        ArrayList<Character> L = new ArrayList<>();

        char D = scanner.next().charAt(0);
        for (char i = '0'; i <= '9'; i++) {
            if (i == D) {
                K--;
                if (K == 0)
                    continue;
                D = scanner.next().charAt(0);
            } else {
                L.add(i);
            }
        }

        char[] NC = N.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aNC : NC) {
            for (Character aL : L) {
                if (aL == aNC) {
                    sb.append(aL);
                    break;
                }
            }
        }
        if (sb.length() < NC.length) {
            sb = new StringBuilder();
            for (int i = 0; i < NC.length; i++) {
                if (i == 0) {
                    for (Character aL : L) {
                        if (aL > NC[i]) {
                            sb.append(aL);
                            break;
                        }
                    }
                } else {
                    sb.append(L.get(0));
                }

            }
        }
        if (sb.length() < NC.length) {
            sb = new StringBuilder();
            for (int i = 0; i < NC.length + 1; i++) {
                if (i == 0)
                    sb.append(L.get(0) == 0 ? L.get(0) : L.get(1));
                else sb.append(L.get(0));
            }
        }
        System.out.println(sb.toString());
    }
}