import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int sx = scan.nextInt();
        int sy = scan.nextInt();
        int tx = scan.nextInt();
        int ty = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        // s->t
        for (int x = sx; x <= tx; x++) {
            sb.append('R');
        }
        for (int y = sy; y <= ty; y++) {
            sb.append('U');
        }
        // t->s
        for (int x = tx; sx <= x; x--) {
            sb.append('L');
        }
        for (int y = ty; sy <= y; y--) {
            sb.append('D');
        }
        // s->t
        sb.append('D');
        for (int x = sx; x <= tx+1; x++) {
            sb.append('R');
        }
        for (int y = sy-1; y <= ty; y++) {
            sb.append('U');
        }
        sb.append('L');
        // t->s
        sb.append('U');
        for (int x = tx; sx-1 <= x; x--) {
            sb.append('L');
        }
        for (int y = ty+1; sy <= y; y--) {
            sb.append('D');
        }
        sb.append('R');
        System.out.println(sb.toString());
    }
}
