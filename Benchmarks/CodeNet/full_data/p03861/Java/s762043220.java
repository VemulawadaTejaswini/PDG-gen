import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long sum = 0;
        
        sum = (b - a) / x;
        if (a % x == 0 || b % x == 0) {
            if (a != b) {
            sum++;
            }
        }
        System.out.println(sum);
    }
}