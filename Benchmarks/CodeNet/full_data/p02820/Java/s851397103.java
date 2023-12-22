import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        String[] t = T.split("");
        String[] ret = new String[N];
        for (int i = 0; i < t.length; i++) {
            if (i < K) {
                switch (t[i]) {
                    case "r":
                        ret[i] = "p";
                        break;
                    case "p":
                        ret[i] = "s";
                        break;
                    case "s":
                        ret[i] = "r";
                        break;
                    default:
                        break;
                }
            } else {
                switch (t[i]) {
                    case "r":
                        if (!Objects.equals(ret[i - K], "p")) {
                            ret[i] = "p";
                        } else {
                            ret[i] = "";
                        }
                        break;
                    case "p":
                        if (!Objects.equals(ret[i - K], "s")) {
                            ret[i] = "s";
                        } else {
                            ret[i] = "";
                        }
                        break;
                    case "s":
                        if (!Objects.equals(ret[i - K], "r")) {
                            ret[i] = "r";
                        } else {
                            ret[i] = "";
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        int count = 0;
        for (String string : ret) {
            switch (string) {
                case "r":
                    count += R;
                    break;
                case "s":
                    count += S;
                    break;
                case "p":
                    count += P;
                    break;
                default:
                    break;
            }
        }
        System.out.println(count);
    }
}
