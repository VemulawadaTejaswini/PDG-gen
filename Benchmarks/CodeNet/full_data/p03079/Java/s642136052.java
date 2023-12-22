import java.io.*;
import java.nio.file.WatchEvent;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    private static int A, B, C;

    private static String solver(int a, int b, int c) {

        if (a == b && b == c) {
            return "Yes";
        } else {
            return "No";
        }
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            String[] inputArray = br.readLine().split(" ");
            A = Integer.parseInt(inputArray[0]);
            B = Integer.parseInt(inputArray[1]);
            C = Integer.parseInt(inputArray[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver(A, B, C));

    }
}