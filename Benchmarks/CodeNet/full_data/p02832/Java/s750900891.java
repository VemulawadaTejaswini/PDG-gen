import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int broken = 0;
        int idx = 1;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num != idx) {
                broken++;
            } else {
                idx++;
            }
        }
        if ((n - broken) == idx - 1 && idx > 1) {
            System.out.println(broken);
        } else {
            System.out.println("-1");
        }
    }
}