import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 1;
        for (int i = 2; i * i <= x; i++) {
            int p = i * i;
            while (p <= x) {
                res = Math.max(res, p);
                p *= i;
            } 
        }
        System.out.println(res);
        sc.close();
    }
}