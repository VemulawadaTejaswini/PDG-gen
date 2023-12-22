import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        sc.close();

        for(int i = 1; i <= n; i++) {

            int sum = digitSum(i);
            if (sum >= a && sum <=b){
                total += i;
            }
        }
        System.out.println(total);

    }

    private static int digitSum(int i) {
        int sum = 0;
        do {
            sum += i % 10;
            i = i / 10;
        } while (i > 0);
        return sum;
    }
}