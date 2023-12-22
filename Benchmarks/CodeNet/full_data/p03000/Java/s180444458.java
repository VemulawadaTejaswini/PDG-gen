import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            sum += l[i];
            if (sum > x) {
                break;
            }
        }
        System.out.println(count);
    }

}
