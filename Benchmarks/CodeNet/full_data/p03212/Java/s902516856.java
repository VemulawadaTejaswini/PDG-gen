import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count(0));
    }

    static long count(long a) {
        if (a > n) {
            return 0;
        }
        String as = String.valueOf(a);
        if (as.contains("7") && as.contains("5") && as.contains("3")) {
            return 1 + count(a * 10 + 7) + count(a * 10 + 5) + count(a * 10 + 3);
        }
        return count(a * 10 + 7) + count(a * 10 + 5) + count(a * 10 + 3);
    }
}