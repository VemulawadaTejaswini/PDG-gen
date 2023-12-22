import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Yes");
            return;
        }

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (list[i] <= list[i+1]) {
            } else if (list[i] -1 <= list[i+1] && list[i-1]<= list[i]-1) {
                list[i-1] --;
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
