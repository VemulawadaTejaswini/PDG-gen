import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        long limit[] = new long[5];
        long num[] = {0, 0, 0, 0, 0, 0};
        long N = 0;
        long time = 0;

        try {
            N = Long.parseLong(br.readLine());
        } catch (IOException e) {

        }
        for (int i=0; i<5; i++) {
            try {
                limit[i] = Long.parseLong(br.readLine());
            } catch (IOException e) {

            }
        }
        num[0] = N;
        while (num[5] != N) {
            for (int i=5; i>=1; i--) {
                long movement = min(limit[i-1], num[i-1]);
                num[i] += movement;
                num[i-1] -= movement;
            }
            time++;
        }

        System.out.println(time);
    }

    private static long min(long a, long b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}