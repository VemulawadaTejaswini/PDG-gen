import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int dist[] = new int[3];
        dist[0] = p;
        dist[1] = q;
        dist[2] = r;

        Arrays.sort(dist);

        System.out.println(dist[0]+dist[1]);

        sc.close();
    }
}