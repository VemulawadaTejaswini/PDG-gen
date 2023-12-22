import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = (int)Math.max(n+m, n-m);
        System.out.println((int)Math.max(max, n*m));
    }
}