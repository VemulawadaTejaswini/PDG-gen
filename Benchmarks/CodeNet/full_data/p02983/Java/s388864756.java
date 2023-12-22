import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = Integer.parseInt(in.next());
        int right = Integer.parseInt(in.next());
        in.close();
        int leftdiv = left / 2019;
        int rightdiv = right / 2019;
        int leftMod = left % 2019;
        int ans = 0;
        if (leftdiv == rightdiv) {
            ans = leftMod * (leftMod + 1) % 2019;
        }
        System.out.println(ans);
    }
}
