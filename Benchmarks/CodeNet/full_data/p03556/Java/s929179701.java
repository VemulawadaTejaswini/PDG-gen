import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; ; i++) {
            if(n < i * i) {
                System.out.println((i - 1) * (i - 1));
                return;
            }
        }
    }
}