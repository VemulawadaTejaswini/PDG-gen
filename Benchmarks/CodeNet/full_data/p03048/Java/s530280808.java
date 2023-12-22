import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int R = Integer.parseInt(abt[0]);
        int G = Integer.parseInt(abt[1]);
        int B = Integer.parseInt(abt[2]);
        int N = Integer.parseInt(abt[3]);

        int pattern = 0;
        for (int i = 0; i * R <= N; i++) {
            long x = i * R;
            for (int j = 0; x + j * G <= N; j++) {
                long y = j * G;
                if ((N - x - y) % B == 0) {
                    pattern++;
                }

            }
        }
        System.out.println(pattern);
    }
}
