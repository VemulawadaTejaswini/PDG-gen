import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] h = new long[n];
        for(int i = 0;i < n;i++) {
            h[i] = stdIn.nextLong();
        }

        for(int i = 1; i < n;i++) {
            for(int j = 0;j < i;j++) {
                if(h[i] < h[j] - 1) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }

}