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

        int count = 0;
        for(int i = 1; i < n;i++) {
            if(h[i] < h[i-1]){
                if(h[i-1] - h[i] >= 2) {
                    System.out.println("No");
                    System.exit(0);
                }else {
                    if(count == 1) {
                        System.out.println("No");
                        System.exit(0);
                    }
                    count++;
                }
            }
        }
        System.out.println("Yes");
    }

}