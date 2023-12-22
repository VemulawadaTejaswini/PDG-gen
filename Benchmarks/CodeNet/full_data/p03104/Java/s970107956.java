import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);

        long[] arr2 = new long[40];
        for (long i = A; i <= B; i++) {
            String bin = String.format("%40s", Long.toBinaryString(i));
            String[] arr3 = bin.split("");
            for (int j = 0; j < 40; j++) {
                arr2[j] += arr3[j].equals("1") ? 1 : 0;
            }
        }
        
        String binAns = "";
        for (long l: arr2) {
            binAns += l % 2 == 0 ? "0": "1";
        }
        out.println(Long.parseLong(binAns, 2));
        out.close();
    }
}