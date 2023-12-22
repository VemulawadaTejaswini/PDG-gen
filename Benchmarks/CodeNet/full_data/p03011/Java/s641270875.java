
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());//int型
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        sc.close();
        int ans = 1000;

        ans = Math.min(a+b,ans);
        ans = Math.min(b+c,ans);
        ans = Math.min(c+a,ans);

        System.out.println(ans);
    }
}
