import java.util.Scanner;

public class Main {
    //Algae
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        long d = sc.nextLong();
        long x = sc.nextLong();
        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
        sc.close();
    }
}
