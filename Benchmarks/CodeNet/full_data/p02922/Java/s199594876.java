import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] AB = sc.nextLine().split(" ");
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        int ans = 0;
        if (B > A) {
            if (B % A == 0) {
                ans = B / A;
            } else {
                ans = B / A + 1;
            }
        } else {
            ans = B / A;
        }
        System.out.println(ans);
    }
}
