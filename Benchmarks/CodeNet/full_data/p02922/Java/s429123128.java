import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] AB = sc.nextLine().split(" ");
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        int plug = 0;
        int ans = 0;
        for (int i = 1; i < 20; i++) {
            if (i != 1) {
                plug--;
            }
            plug += A;
            if (plug >= B) {
                ans = i;
                break;
            }
        }

        System.err.println(plug);
        System.out.println(ans);
    }
}
