import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int R = in.nextInt();
            int G = in.nextInt();
            int B = in.nextInt();
            int N = in.nextInt();
            int count = 0;
            for (int r = 0; r <= R; r++) {
                for (int g = 0; g <= G; g++) {
                    int b = N - r - g;
                    if (b >= 0 && b <= B) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
