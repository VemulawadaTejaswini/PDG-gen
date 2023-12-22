import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt(), sum = 0;
        for (int i = 0; i < M; i++) {
            sum += in.nextInt();
        }
        System.out.println(N >= sum ? N - sum : -1);
    }
}