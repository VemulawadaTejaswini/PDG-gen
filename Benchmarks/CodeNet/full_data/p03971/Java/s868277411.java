import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        int cnt = 1;
        int fcnt = 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' && cnt <= a + b) {
                System.out.println("Yes");
                cnt++;
                continue;
            }
            if (c == 'b' && cnt <= a + b && fcnt <= b) {
                System.out.println("Yes");
                cnt++;
                fcnt++;
                continue;
            }
            System.out.println("No");
        }
    }

}
