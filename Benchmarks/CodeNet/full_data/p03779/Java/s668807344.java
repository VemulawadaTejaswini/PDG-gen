import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        while (x > n * (n + 1) / 2) {
            n++;
        }
        System.out.println(n);
    }

}