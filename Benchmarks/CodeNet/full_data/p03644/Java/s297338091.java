import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int number = 1;
        while (number * 2 <= n) {
            number *= 2;
        }
        System.out.println(number);
    }
}