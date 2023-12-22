import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        execute();
    }

    private static void execute() {

        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int[] imos = new int[N + 1];
        for (int i = 0; i < M; i++) {
            // gate number : Li to Ri
            String[] lr = sc.nextLine().split(" ");
            int L = Integer.parseInt(lr[0]);
            int R = Integer.parseInt(lr[1]);
            for (int j = L; j < R + 1; j++) {
                imos[j] += 1;
            }
        }

        int max = 0;
        for (int i : imos) {
            max = Math.max(max, i);
        }

        int passed = 0;
        for (int i : imos) {
            if (i == max) {
                passed++;
            }
        }

        System.out.println(passed);
    }

}
