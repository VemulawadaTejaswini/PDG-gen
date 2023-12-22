import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }

        int res = 0;
        while (true) {
            boolean flag = false;

            for (int y = 0; y < n; y++) {
                if (x[y] % 2 != 0)
                    flag = true;
            }
            if (flag)
                break;

            for (int i = 0; i < n; i++) {
                x[i] = x[i] / 2;
            }
            res++;

        }
        System.out.print(res);

    }
}
