import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        boolean found = false;
        int whitecount = 0;
        int blackcount = 0;
        int i = 0;
        for(; i < N; i++) {
            if (found) {
                if (data[i] == '.') {
                    whitecount += 1;
                }
                if (data[i] == '#') {
                    blackcount += 1;
                }
            }
            if (data[i] == '#') {
                blackcount += 1;
                found = true;
                continue;
            }
        }
        System.out.println(Math.min(whitecount, blackcount));
    }
}
