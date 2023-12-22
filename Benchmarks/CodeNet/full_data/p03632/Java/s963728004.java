import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[4];
        int ans1 = 0, ans2 = 0;
        for (int i = 0; 4 > i; i++) {
            N[i] = sc.nextInt();
        }
        if (N[0] > N[2]) {
            ans1 = N[0];

        } else {
            ans1 = N[2];
        }
        if (N[1] > N[3]) {
            ans2 = N[3];
        } else {
            ans2 = N[1];
        }
        if (ans1 > ans2) {
            System.out.println("0");
        } else {
            System.out.println(ans2 - ans1);
        }
    }
}
