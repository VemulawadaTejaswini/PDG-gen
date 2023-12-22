import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(scanner.next());
        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            int b = a[i];
            boolean diff = false, counted = false;
            for (int j = i + 1; j < a.length; j++) {
                if (b != a[j])
                    diff = true;
                if (b == a[j] && diff) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count % 1000000007);
    }

}