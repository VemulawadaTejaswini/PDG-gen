import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();

        long min = Integer.MAX_VALUE;
        for (long i = a; i <= b; i++) {
            for (long j = a; j <=i ; j++) {
                if(i!=j) {
                    min = Math.min((i % 2019 * j % 2019) % 2019, min);
                }
            }
        }
        System.out.println(min);
    }
}