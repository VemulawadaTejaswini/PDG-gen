import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (x*2<=n) {
            x *= 2;
        }
        System.out.println(x);
        sc.close();
    }
}