import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long sum = 0;
        
        for (long i = a; i <= b; i++) {
            if (i % x == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}