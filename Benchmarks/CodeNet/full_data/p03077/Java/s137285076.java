import java.io.*;

public class C{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int limit[] = new int[5];
        int num[] = {0, 0, 0, 0, 0, 0};
        int time = 0;
        int N = 0;

        try {
            N = Integer.parseInt(br.readLine());
        } catch (IOException e) {

        }
        for (int i=0; i<5; i++) {
            try {
                limit[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {

            }
        }
        num[0] = N;
        while (num[5] != N) {
            for (int i=5; i>=1; i--) {
                int movement = min(limit[i-1], num[i-1]);
                num[i] += movement;
                num[i-1] -= movement;
            }
            time++;
        }

        System.out.println(time);
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}