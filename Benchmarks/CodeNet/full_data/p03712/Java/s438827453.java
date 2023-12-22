import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        sb.append(sharp(w + 2));
        sb.append("\n");
        for (int i = 0; i < h; i++) {
            sb.append(sharp(1));
            sb.append(sc.next());
            sb.append(sharp(1));
            sb.append("\n");
        }
        sb.append(sharp(w + 2));
        sb.append("\n");
        System.out.println(sb.toString());
    }

    private static String sharp(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("#");
        }
        return sb.toString();
    }
}