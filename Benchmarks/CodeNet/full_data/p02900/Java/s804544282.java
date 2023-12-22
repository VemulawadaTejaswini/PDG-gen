import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int minAB = Math.min(A,B);
        boolean[] hurui = new boolean[minAB+1];
        Arrays.fill(hurui, true);
        int upper = (int)(Math.sqrt(minAB+1)) + 1;
        try {

            for(int i = 2; i <= upper; i++) {
                if(!hurui[i]) {
                    continue;
                }
                
                for(int j = 2*i; j < minAB+1; j+=i) {
                    hurui[j] = false;
                }
            }
        } catch(RuntimeException e) {
            System.out.println("0");
            System.exit(0);
        }

        int ans = 0;
        for (int i = 1; i < minAB + 1; i++) {
            if(!hurui[i]) {
                continue;
            }
            if(A%i == 0 && B%i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}