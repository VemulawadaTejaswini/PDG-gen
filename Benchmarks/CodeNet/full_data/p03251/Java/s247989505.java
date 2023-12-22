import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int m = reader.nextInt();
        int max = reader.nextInt();
        int min = reader.nextInt();
        int in;
        for (int i = 0; i < n; ++i) {
            in = reader.nextInt();
            if (in > max)
                max = in;
        }
        for (int i = 0; i < m; ++i) {
            in = reader.nextInt();
            if (in < min)
                min = in;
        }
        System.out.println(min > max ? "No war" : "War");

    }
}