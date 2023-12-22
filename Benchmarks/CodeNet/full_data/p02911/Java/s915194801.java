import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // N
        int initialPoint = sc.nextInt(); // K
        int roundCount = sc.nextInt(); // Q
        int[] winners = new int[roundCount]; // A[i]
        for (int i = 0; i < roundCount; i++) {
            winners[i] = sc.nextInt() - 1;
        }
        int[] points = new int[number];
        for (int winner : winners) {
            points[winner]++;
        }
        for (int i = 0; i < number; i++) {
            if((initialPoint - (roundCount - points[i])) > 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}