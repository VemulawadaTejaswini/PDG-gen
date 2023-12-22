import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); // Write Output
            int n = in.nextInt();
            int length = in.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.next();
            }
            Solver solver = new Solver();
            solver.solve(arr);
            out.write(output.toString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(output);
    }

}

class Solver {
    public void solve(String arr[]) {
        String a = "";
        Arrays.sort(arr, (s1, s2) -> s1.compareTo(s2));
        for (String s : arr) {
            a = a.concat(s);
        }
        Main.output.append(a);

    }
}