import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = nextInt(sc);
        int M = nextInt(sc);

        int LMax = 1;
        int RMin = N;

        for (int i = 0; i < M; i++) {
            int Li = nextInt(sc);
            int Ri = nextInt(sc);

            if (Li > LMax) LMax = Li;
            if (Ri < RMin) RMin = Ri;
         }

        int num = RMin - LMax + 1;

        show((num < 0) ? 0 : num);
    }
    private static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    private static void show(Object answer) {
        System.out.println(answer);
    }
}
