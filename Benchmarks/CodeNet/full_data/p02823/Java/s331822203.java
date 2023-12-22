import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 1_000_000_000;
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        long res;
        if ((max - min) % 2 == 0) res = (max - min) / 2;
        else {
            long tmp = min - 1;
            res = tmp + 1 + (max-1-tmp)/2;
        }
        System.out.println(res);
    }
    static long pgcd(long a, long b) {
        if(b == 0) return a;
        return pgcd(b, a%b);
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}