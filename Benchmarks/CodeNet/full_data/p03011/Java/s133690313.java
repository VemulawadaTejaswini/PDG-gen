import static java.util.Arrays.sort;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();

        int num[] = {P, Q, R};
        sort(num);
        
        System.out.println(num[0] + num[1]);
    }
}
