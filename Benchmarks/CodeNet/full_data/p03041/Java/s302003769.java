import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String tmp = s.substring(k - 1, k).toLowerCase();
        String ans = s.substring(0, k - 1);
        System.out.print(ans + tmp);
        String ans2 = s.substring(k, s.length());
        System.out.println(ans2);
    }
}