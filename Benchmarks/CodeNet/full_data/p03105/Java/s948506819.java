import java.util.*;

public class Main{
    //Favorite Sound
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(helper(a, b, c));
        sc.close();
    }

    public static int helper(int a, int b, int c) {
        return b / a > c ? c : b / a;
    }
}
