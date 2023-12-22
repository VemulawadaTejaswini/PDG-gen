import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = N / 2;
        int count = 1;
        while (i != 0) {
            i = i / 2;
            count++;
        }
        if (count * 2 == N) {
            System.out.println(N);
        } else {
            System.out.println((count - 1) * 2);
        }

    }
}
