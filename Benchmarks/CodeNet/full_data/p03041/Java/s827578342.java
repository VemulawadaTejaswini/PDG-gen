import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char[] ans = s.toCharArray();
        ans[k-1] = Character.toLowerCase(ans[k-1]);

        System.out.println(ans);
    }

}
