import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            // main.solveA(sc);
            main.solveB(sc);
            // main.solveC(sc);

        }
    }

    private void solveC(Scanner sc) {

    }

    void solveB(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += (nums[i] / 2);
                if (nums[i] % 2 > 0 && nums[i + 1] > 0) {
                    sum++;
                    nums[i + 1]--;
                }
            }

            sum += (nums[n - 1] / 2);

            System.out.println(sum);

        } catch (IOException e) {

        }

    }

    void solveA(Scanner sc) {
        String s = sc.next();
        if (s.indexOf("N") >= 0 && s.indexOf("S") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("S") >= 0 && s.indexOf("N") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("W") >= 0 && s.indexOf("E") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("E") >= 0 && s.indexOf("W") < 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
