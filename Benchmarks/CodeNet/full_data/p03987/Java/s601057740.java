import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(in.readLine());
            String[] an = in.readLine().split(" ");
            int[] list = new int[n];
            for (int i = 0; i < an.length; ++i) {
                list[i] = Integer.parseInt(an[i]);
            }

            long sum = 0;
            for (int l = 0; l < n; ++l) {
                long sum1 = 0;
                for (int r = l; r < n; ++r) {
                    sum1 += min(list, l, r);
                }
                sum += sum1;
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int min(int[] list, int l, int r) {
        int min = list[l];
        for (int i = l + 1; i <= r; ++i) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min; 
    }
}