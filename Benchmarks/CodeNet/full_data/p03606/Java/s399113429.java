import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1 ; i <= N ; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            ans = r - l + 1;
        }
        System.out.println(ans);
    }

}