import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            t += arr[i];
        }
        double rate = t / (4 * m);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= rate) {
                c++;
            }
        }
        System.out.println(c >= m ? "Yes" : "No");
    }
}