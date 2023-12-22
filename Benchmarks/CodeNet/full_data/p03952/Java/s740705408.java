import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int mx = x - 1;
        int px = x + 1;
        scan.close();
        int i = 1;
        int nm1 = n - 1;
        int t = n * 2;
        int r = t - 1;
        int count = 1;

        if (x == 1 || x == r) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            while (count != nm1) {
                if (i == mx || i == x || i == px) {
                } else {
                    System.out.println(i);
                    count++;
                }
                i++;
            }
            if (x == 2) {
                System.out.println(px);
                System.out.println(x);
                System.out.println(mx);
            } else {
                System.out.println(mx);
                System.out.println(x);
                System.out.println(px);
            }
            while (i != t) {
                if (i == mx || i == x || i == px) {
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

}
