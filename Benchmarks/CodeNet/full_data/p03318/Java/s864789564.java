import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long k;
        try (Scanner cin = new Scanner(System.in)) {
            k = cin.nextLong();
        }

        long count = 0L;
        double cur = 1.0;
        for (long l = 1; count < k; l++) {
            long denomi = Long.toString(l + 1).chars().map(x -> x - '0').sum();
            double next = (double)(l + 1) / (double)denomi;
            if (cur <= next) {
                System.out.println(l);
                count++;
            }
            cur = next;
        }
    }

}