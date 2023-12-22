import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        int sum = 0;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
            sum += a;
        }
        if (sum % 2 == 0) {
            h = sum / 2;
        } else {
            h = (sum / 2) + 1;
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += ary[i];
            if (h <= temp) {
                break;
            }

        }
        System.out.println(Math.abs(temp - (sum - temp)));
    }
}