import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || i % 2 == 0) {
                alice += Integer.parseInt(numbers[i]);
            } else {
                bob += Integer.parseInt(numbers[i]);
            }
        }
        System.out.println(alice - bob);
    }
}
