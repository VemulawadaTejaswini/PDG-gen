import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int X = scan.nextInt();
        HashSet<Integer> station = new HashSet<>();
        for (int i = 0; i < M; i++) {
            station.add(scan.nextInt());
        }
        int costR = 0;
        for(int i = 0; i < X; i++) {
            if (station.contains(i)) {
                costR += 1;
            }
        }
        int costL = 0;
        for(int i = X+1; i <= N; i++) {
            if (station.contains(i)) {
                costL += 1;
            }
        }
        System.out.println(Math.min(costR, costL));
    }
}
