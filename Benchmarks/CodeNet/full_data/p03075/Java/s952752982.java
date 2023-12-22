import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] antennas = new int[5];
        for (int i = 0; i < 5; i++) {
            antennas[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (i == j) continue;
                int dist = Math.abs(antennas[i] - antennas[j]);
                if (dist > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}
