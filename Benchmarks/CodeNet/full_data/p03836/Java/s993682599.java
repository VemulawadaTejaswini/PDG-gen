import java.util.Scanner;

public class Main {

    private static StringBuilder appendString(StringBuilder sb, String str, int cnt) {
        for (int i = 0; i < cnt; i++) {
            sb.append(str);
        }
        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        ans = appendString(ans, "U", ty - sy);
        ans = appendString(ans, "R", tx - sx);
        ans = appendString(ans, "D", ty - sy);
        ans = appendString(ans, "L", tx - sx);
        ans.append("L");
        ans = appendString(ans, "U", ty - sy + 1);
        ans = appendString(ans, "R", tx - sx + 1);
        ans.append("D");
        ans.append("R");
        ans = appendString(ans, "D", ty - sy + 1);
        ans = appendString(ans, "L", tx - sx + 1);
        ans.append("U");
        System.out.println(ans.toString());
    }

}
