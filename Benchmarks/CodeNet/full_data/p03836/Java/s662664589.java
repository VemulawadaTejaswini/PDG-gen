import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        appendRoute(sb, ty - sy, "U");
        appendRoute(sb, tx - sx, "R");
        appendRoute(sb, ty - sy, "D");
        appendRoute(sb, tx - sx, "L");
        sb.append("L");
        appendRoute(sb, ty - sy + 1, "U");
        appendRoute(sb, tx - sx + 1, "R");
        sb.append("D");
        sb.append("R");
        appendRoute(sb, ty - sy + 1, "D");
        appendRoute(sb, tx - sx + 1, "L");
        sb.append("U");
        System.out.println(sb.toString());
    }
    private static void appendRoute(StringBuilder sb, int num, String r) {
        for (int i = 0; i < num; i++) {
            sb.append(r);
        }
    }

}