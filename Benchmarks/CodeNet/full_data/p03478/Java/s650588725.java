import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = 0;
        for (int i = 1 ; i <= N ; i++ ) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum >= A && sum <= B) {
                res += i;
            }
        }
        System.out.println(res);
    }

}