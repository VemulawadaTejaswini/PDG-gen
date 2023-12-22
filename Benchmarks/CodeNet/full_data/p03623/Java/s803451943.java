import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static char solve(int x, int a, int b) {
        int dist_a = Math.abs(x-a);
        int dis_b = Math.abs(x-b);

        return dist_a < dis_b ?  'A': 'B';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(solve(x,a,b));
    }
}