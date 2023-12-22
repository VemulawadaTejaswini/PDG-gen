import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            min = Math.min (min, sc.nextLong());
        }
        // calculate how much travels need with smallest occupy(it's 1 move) + 4 moves more = 5 moves between 6 cities
        // 1 => 2 => 3 => 4 => 5 => 6  = 5 moves 
        System.out.println((long) Math.ceil(1.0 * n / min) + 4);
    }
}