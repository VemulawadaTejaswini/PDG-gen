import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int K = stdIn.nextInt();
        stdIn.close();

        int count = 0;

        while (N != 0) {
            N = N / K;
            count++;
        }
        
        System.out.println(count);
    }
}