import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b4 = 0;
        int b2 = 0;
        int b0 = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a % 2 == 0) {
                if (a % 4 == 0)
                    b4++;
                else
                    b2++;
            } else {
                b0++;
            }
        }

        String ans = "Yes";

        if (b0 > b4) {
            ans = "No";
        }
        if (b2 == 0 && b0 - b4 == 1)
            ans = "Yes";

        System.out.println(ans);
    }

}