import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[10];
        Arrays.fill(arr, 1);
        for (int i = 0; i < k; i++) {
            int c = in.nextInt();
            arr[c]--;
        }
        Solver solver = new Solver();
        solver.solve(arr, n);
        System.out.println(output);
    }

}

class Solver {
    public void solve(int arr[], int n) {
        while (helper(n, arr)) {
            n++;
        }

        Main.output.append(n);
    }

    public boolean helper(int n, int arr[]) {
        while (n > 0) {
            if (arr[n % 10] == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}