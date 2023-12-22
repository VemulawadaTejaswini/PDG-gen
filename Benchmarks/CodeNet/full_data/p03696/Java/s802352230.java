import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        String ans = solve(n, s);
        System.out.println(ans);
    }

    static String solve(int n, String s) {
        int needOpen = 0;
        int needClose = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                needClose++;
            } else {
                if (needClose == 0) {
                    needOpen++;
                } else {
                    needClose--;
                }
            }
        }

        System.err.printf("%s-%s %s \n", needOpen, needClose, s);
        String tmp = s.concat(makeString(")", needClose));
        String ans = makeString("(", needOpen).concat(tmp);
        return ans;
    }

    private static String makeString(String s, int needClose) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < needClose; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
