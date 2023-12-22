import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int w[] = new int[n];
        int total = 0;
        int sum = 0;
        int a = 0;
        for (int i = 0; i < w.length; i++)
            w[i] = stdIn.nextInt();
        for (int i = 0; i < w.length; i++)
            total += w[i];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            if (sum > total / 2) {
                a = i;
                break;
            }
        }
        if (sum * 2 - total < total - (sum - w[a]) * 2)
            System.out.println(sum * 2 - total);
        else
            System.out.println(total - (sum - w[a]) * 2);
    }
}