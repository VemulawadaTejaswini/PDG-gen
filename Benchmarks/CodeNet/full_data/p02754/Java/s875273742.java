import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();

        //N/(A+B) finds the number of times red and blue balls repeats
        //multiplying by A finds the number of blue balls
        // adding Math.min(N%(A+B),A) finds the number of
        // blue balls the group of red and  blue that wasn't repeated

        System.out.println(N/(A+B) * A + Math.min(N%(A+B),A));
    }
}
