import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        sc.close();
        long count = (b-a) / x;
        if(a % x == 0) {
            count++;
        }
        System.out.println(count);
    }
}