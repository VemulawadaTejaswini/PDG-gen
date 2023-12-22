import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long sum = 0;

        for (int i = 1; i <= input; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}