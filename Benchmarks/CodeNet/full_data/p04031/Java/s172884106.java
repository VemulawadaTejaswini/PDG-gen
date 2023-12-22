import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;

public class C {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Solver solver = new Solver();
        solver.solve(arr);
        System.out.println(output);
    }

}

class Solver {
    public void solve(int arr[]) {
        int ans = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            // Try each number to find min
            int curr = 0;
            for (int j = 0; j < arr.length; j++) {
                curr += (arr[j] - i) * (arr[j] - i);
            }
            ans = Math.min(curr, ans);
            // arr[idx] - i
        }
        C.output.append(ans);
    }
}