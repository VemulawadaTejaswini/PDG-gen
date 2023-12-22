import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            int start = a[i];
            int counter = 0;
            while (start % 2 == 0) {
                counter++;
                start /= 2;
            }
            sum += counter;
        }
        System.out.println(sum);
        sc.close();
    }
}