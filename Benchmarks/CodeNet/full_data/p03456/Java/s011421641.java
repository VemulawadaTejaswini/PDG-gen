import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = b;
        if (b >= 100)
            x += a * 1000;
        else if (b >= 10)
            x += a * 100;
        else
            x += a * 10;

        boolean isRe = false;
        int cnt = 1;
        int total = cnt * cnt;
        while (total <= x) {
            if (x == total) {
                isRe = true;
                break;
            }
            cnt++;
            total = cnt * cnt;
        }
      	
        System.out.println(isRe ? "Yes" : "No");
    }
}
