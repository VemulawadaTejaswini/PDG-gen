import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int ai = scanner.nextInt();
            a[i]=ai;
            sum+=ai;
        }
        int d = sum/(4*m);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]>=d) c++;
        }

        if(c>=m) System.out.println("Yes");
        else System.out.println("No");
    }
}
