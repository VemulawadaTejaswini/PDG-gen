import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        stdIn.close();
        
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3== 0 && i % 5 == 0) {

            } else if (i % 3== 0) {

            } else if (i % 5 == 0) {

            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}