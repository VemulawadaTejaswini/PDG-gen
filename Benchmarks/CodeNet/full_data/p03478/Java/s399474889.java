import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int total = 0;
        for (int i = 0; i <= N; i++) {
            int four = i / 10000;
            int three = (i - 10000 * four) / 1000;
            int two = (i - 10000 * four - three * 1000) / 100;
            int one = (i - 10000 * four - three * 1000 - 100 * two) / 10;
            int zero = i - 10000 * four - three * 1000 - 100 * two - 10 * one;
            int add = four + three + two + one + zero;
            if (add >= A && add <= B) {
                total += i;
            }

        }
        System.out.println(total);
        sc.close();
    }

}