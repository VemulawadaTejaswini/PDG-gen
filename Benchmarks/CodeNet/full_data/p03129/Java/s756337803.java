import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        if (k == 1)
            System.out.println("YES");
        if (n <= k)
            System.out.println("NO");
        else {
            int count = 0;
            for (int i=1; i<=n; i+=2) {
                count++;
                if (i>n)
                    count--;
                if (count == k)
                    break;
            }
            if (count == k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
