import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int m, n;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            n = sc.nextInt();
            arr = new int[n]；
            int c4 = 0, c2 = 0, c1 = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(sc.next());
                if (arr[j] % 4 == 0) c4++;
                else if (arr[j] % 2 == 0) c2++;
                else c1++;
            }
            if (c4 >= n / 2 || c4 >= c1) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}

