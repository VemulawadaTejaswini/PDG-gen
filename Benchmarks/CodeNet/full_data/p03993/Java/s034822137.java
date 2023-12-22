import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] likes = new int[n];
        for (int i = 0; i < n; i++) {
            likes[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (likes[likes[i] - 1] - 1 == i) {
                ans++;
            }
        }

        System.out.println(ans / 2);
    }
}